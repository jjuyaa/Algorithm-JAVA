package String;

import java.io.*;

public class BOJ2743B {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String S = br.readLine();
		
		bw.write(S.length() + "\n");
		bw.flush();
	}
}