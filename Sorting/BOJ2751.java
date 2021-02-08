package sorting;

import java.io.*;
import java.util.*;

public class BOJ2751 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		int N = Integer.parseInt(str);
		
		int[] num = new int[N];
		
		for (int i = 0; i < N; i++) {
			str = br.readLine();
			num[i] = Integer.parseInt(str);
		}
		
		Arrays.sort(num);
		
		for (int i = 0; i < N; i++) {
			bw.write(String.valueOf(num[i]));
			bw.write('\n');
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}