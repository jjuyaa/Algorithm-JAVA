package io;

import java.util.Scanner;

public class BOJ2446 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		for (int i = N; i > 0; i--) {
			for (int k = 0; k < N - i; k++)
				System.out.print(" ");
			for (int j = 1; j <= 2*i-1; j++)
				System.out.print("*");
			System.out.println();
		}
		for (int i = 2; i <= N; i++) {
			for (int j = 0; j < N-i; j++)
				System.out.print(" ");
			for (int k = 1; k <= 2*i-1; k++)
				System.out.print("*");
			System.out.println();
		}
	}	
}