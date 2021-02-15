package String;

import java.io.*;

public class BOJ11655B {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[] upper = {'A', 'B', 'C', 'D' ,'E', 'F', 'G' ,'H', 'I', 'J', 
				'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 
				'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		char[] lower = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
				'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 
				'u', 'v', 'w', 'x', 'y', 'z'};
		
		String S = br.readLine();
		char[] ROT_S = new char[S.length()];
		
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) >= 'a' && S.charAt(i) <= 'z') {
				if (S.charAt(i)-'a' + 13 >= 26)
					ROT_S[i] = lower[S.charAt(i) - 'a' + 13 - 26];
				else
					ROT_S[i] = lower[S.charAt(i) - 'a' + 13];
			}
			else if (S.charAt(i) >= 'A' && S.charAt(i) <= 'Z') {
				if (S.charAt(i)-'A' + 13 >= 26)
					ROT_S[i] = upper[S.charAt(i) - 'A' + 13 - 26];
				else
					ROT_S[i] = upper[S.charAt(i) - 'A' + 13];
			}
			else
				ROT_S[i] = S.charAt(i);
		}
		
		for (int i = 0; i < ROT_S.length; i++)
			bw.write(ROT_S[i]);
		bw.write("\n");
		bw.flush();
	}
}