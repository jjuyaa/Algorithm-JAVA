package level05;

import java.util.Scanner;

public class BOJ1546 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int M = 0;
		double sum = 0;
		
		int[] score = new int[N];
		for (int i = 0; i < N; i++) {
			score[i] = scanner.nextInt();
			if (score[i] > M)
				M = score[i];
		}
		
		double[] newScore = new double[N];
		for (int i = 0; i < N; i++) {
			newScore[i] = (double) score[i] / M * 100;
			sum += newScore[i];
		}
		System.out.println(sum / N);		
	}
}