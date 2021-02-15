package String;

import java.io.*;

public class BOJ10820B {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String S = "";
		
		while ((S = br.readLine()) != null) {
			int[] count = new int[4];
			for (int i = 0; i < S.length(); i++) {
				if (S.charAt(i) >= 'a' && S.charAt(i) <= 'z')
					count[0] += 1;
				else if (S.charAt(i) >= 'A' && S.charAt(i) <= 'Z')
					count[1] += 1;
				else if (S.charAt(i) >= '0' && S.charAt(i) <= '9')
					count[2] += 1;
				else if (S.charAt(i) == ' ')
					count[3] += 1;
			}
			for (int i: count) {
				bw.write(i + " ");
			}
			bw.write('\n');
			bw.flush();
		}
	}
}