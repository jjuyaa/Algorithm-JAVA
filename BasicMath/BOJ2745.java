package BasicMath;

import java.io.*;

public class BOJ2745 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String S = br.readLine();
		String[] s = S.split(" ");
		String N = s[0];
		int B = Integer.parseInt(s[1]);
		long tenN = 0;
		
		for (int i = 0; i < N.length(); i++) {
			if (N.charAt(N.length()-i-1) > '9')
				tenN = tenN + (10 + N.charAt(N.length()-i-1)-'A') * (long)Math.pow(B, i);
			else
				tenN = tenN + (N.charAt(N.length()-i-1)-'0') * (long)Math.pow(B, i);
		}
		
		bw.write(Long.toString(tenN));
		bw.flush();
	}
}