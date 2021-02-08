package io;

import java.util.Scanner;

public class BOJ11721 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String line = scanner.nextLine();
		
		for (int i = 0; i < line.length(); i++) {
			System.out.print(line.charAt(i));
			if (i % 10 == 9)
				System.out.println();
		}
	}
}