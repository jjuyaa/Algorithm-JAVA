package StackQueueDeck;

import java.util.Scanner;

public class BOJ10799 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String line = scanner.next();
		int little = 0;
		int sum = 0;
		
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == '(') {
				if (line.charAt(i+1) == '(')
					little++;
				else {
					sum += little;
					i++;
				}
			}
			else {
				sum++;
				little--;
			}
		}
		
		System.out.println(sum);
	}
}