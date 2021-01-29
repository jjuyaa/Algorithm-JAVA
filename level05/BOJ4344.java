package level05;

import java.util.Scanner;

public class BOJ4344 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int C = scanner.nextInt();
		double[] rate = new double[C];
		
		for (int i = 0; i < C; i++) {
			int N = scanner.nextInt();
			int[] score = new int[N];
			double sum = 0;
			double mean;
			double count = 0;
			
			for (int j = 0; j < N; j++) {
				score[j] = scanner.nextInt();
				sum += score[j];
			}
			mean = sum / N;
			
			for (int j = 0; j < N; j++) {
				if (score[j] > mean)
					count++;
			}
			rate[i] = count / N * 100;
		}
		
		for(int i = 0; i < C; i++)
			System.out.printf("%.3f%%\n", rate[i]);
	}
}