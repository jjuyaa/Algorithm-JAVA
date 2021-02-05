package io;

import java.util.Scanner;

public class BOJ2445 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			for (int k = N - i; k > 0; k--)
				System.out.print(" ");
			for (int k = N - i; k > 0; k--)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
		for (int i = 1; i < N; i++) {
			for (int j = N - i; j > 0; j--)
				System.out.print("*");
			for (int k = 1; k <= i; k++)
				System.out.print(" ");
			for (int k = 1; k <= i; k++)
				System.out.print(" ");
			for (int j = N - i; j > 0; j--)
				System.out.print("*");
			System.out.println();
		}	
	}
}