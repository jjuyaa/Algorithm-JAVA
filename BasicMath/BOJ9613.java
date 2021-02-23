package BasicMath;

import java.io.*;

public class BOJ9613 {
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
		
		int t = Integer.parseInt(br.readLine());
		long[] GCDs = new long[t];
		
		for (int i = 0; i < t; i++) {
			String S = br.readLine();
			String[] s = S.split(" ");
			long gcdSum = 0;
			
			int n = Integer.parseInt(s[0]);
			long[] test = new long[n];
			for (int j = 0; j < n; j++) {
				test[j] = Long.parseLong(s[j+1]);
			}
			for (int a = 0; a < n-1; a++)
				for (int b = a+1; b < n; b++)
					gcdSum += gcd(test[a], test[b]);
			GCDs[i] = gcdSum;
		}
		
		for (int i = 0; i < t; i++)
			bw.write(Long.toString(GCDs[i]) + "\n");
		bw.flush();
	}
}