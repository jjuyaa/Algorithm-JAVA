package sorting;

import java.io.*;
import java.util.Arrays;

public class BOJ11004brbw {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		String[] ss = s.split(" ");
		
		int N = Integer.parseInt(ss[0]);
		int K = Integer.parseInt(ss[1]);
		int[] numbers = new int[N];
		
		s = br.readLine();
		ss = s.split(" ");
		for (int i = 0; i < N; i++)
			numbers[i] = Integer.parseInt(ss[i]);
		
		Arrays.sort(numbers);
		
		bw.write(Integer.toString(numbers[K-1]) + '\n');
		bw.flush();
	}
}