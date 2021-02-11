package StackQueueDeck;

import java.util.Scanner;

public class BOJ9012 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		String[] answer = new String[N];
		
		for (int i = 0; i < N; i++) {
			int sum = 0;
			String line = scanner.next();
			for (int j = 0; j < line.length(); j++) {
				if (sum < 0) {
					answer[i] = "NO";
					break;
				}
				else if (line.charAt(j) == '(')
					sum += 1;
				else
					sum -= 1;
			}
			if (sum == 0)
				answer[i] = "YES";
			else
				answer[i] = "NO";
		}
		
		for (int i = 0; i < N; i++)
			System.out.println(answer[i]);
	}
}