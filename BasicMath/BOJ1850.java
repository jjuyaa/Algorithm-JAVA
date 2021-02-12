package BasicMath;

import java.io.*;

public class BOJ1850 {
	public static long gcd(long a, long b) {
		while (b > 0) {
			long temp = a;
			a = b;
			b = temp % b;
		}
		return a;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line = br.readLine();
		String[] ab = line.split(" ");
		
		long A = Long.parseLong(ab[0]);
		long B = Long.parseLong(ab[1]);
		
		for (int i = 0; i < gcd(A, B); i++) {
			bw.write("1");
		}
		bw.flush();
	}
}