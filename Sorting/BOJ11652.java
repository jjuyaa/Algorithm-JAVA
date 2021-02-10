package sorting;

import java.io.*;
import java.util.Arrays;

public class BOJ11652 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		long[] card = new long[N];
		int countMax = 1;
		int count = 1;
		
		for (int i = 0; i < N; i++) 
			card[i] = Long.parseLong(br.readLine());
		
		Arrays.sort(card);
		
		long num = card[0];
		for (int i = 1; i < N; i++) {
			if (card[i-1] == card[i])
				count++;
			else
				count = 1;
			
			if (countMax < count) {
				countMax = count;
				num = card[i];
			}
		}
		
		bw.write(Long.toString(num));
		bw.flush();
	}
}