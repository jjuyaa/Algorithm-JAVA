package io;

import java.util.Scanner;

public class BOJ10991 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		for (int i = 1; i <= N; i++) {
			for (int j = i; j <= N-1; j++)
				System.out.print(" ");
			for (int k = 1; k <= 2*i-1; k++) {
				if (k % 2 == 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}