package BasicMath;

import java.io.*;

public class BOJ1934brbw {
	public static int gcd(int a, int b) {
		while (b > 0) {
			int temp = a;
			a = b;
			b = temp % b;
		}
		
		return a; 
	}
	
	public static int lcm(int a, int b, int gcd) {
		return a * b / gcd;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		int[] LCM = new int[T];
		
		for (int i = 0; i < T; i++) {
			String input = br.readLine();
			String[] ab = input.split(" ");
			int A = Integer.parseInt(ab[0]);
			int B = Integer.parseInt(ab[1]);
			
			LCM[i] = lcm(Math.max(A, B), Math.min(A, B), gcd(A, B));
			bw.write(Integer.toString(LCM[i]) + '\n');
		}
		bw.flush();
	}	
}