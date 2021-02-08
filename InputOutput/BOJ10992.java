package io;

import java.util.Scanner;

public class BOJ10992 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		for (int i = 1; i <= N; i++) {
			if (i == 1) {
				for (int j = 1; j <= N-i; j++)
					System.out.print(" ");
				System.out.print("*");
			}
			else if (i == N)
				for (int j = 1; j <= 2*i-1; j++)
					System.out.print("*");
			else {
				for (int k = 1; k <= N-i; k++)
					System.out.print(" ");
				System.out.print("*");
				for (int k = N-i+2; k < 2*N-1-(N-i); k++)
					System.out.print(" ");
				System.out.print("*");
			}
			System.out.println();
		}
	}
}