package io;

import java.util.Scanner;

public class BOJ10953 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		
		int[] sum = new int[T];
		int A, B;
		String ab;
		String[] splitAB;
		
		for (int i = 0; i < T; i++) {
			ab = scanner.next();
			splitAB = ab.split(",");
			
			A = Integer.parseInt(splitAB[0]);
			B = Integer.parseInt(splitAB[1]);
			
			sum[i] = A+B;
		}
		
		for (int i = 0; i < T; i++)
			System.out.println(sum[i]);
	}
}