package String;

import java.io.*;

public class BOJ10808B {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] alphabetCount = new int[26];
		for (int i = 0; i < alphabetCount.length; i++)
			alphabetCount[i] = 0;
		
		String S = br.readLine();
		
		for (int i = 0; i < S.length(); i++) {
			int index = S.charAt(i) - 'a';
			alphabetCount[index] += 1;
		}
		
		for (int i = 0; i < alphabetCount.length; i++)
			bw.write(alphabetCount[i] + " ");
		
		bw.flush();
	}
}