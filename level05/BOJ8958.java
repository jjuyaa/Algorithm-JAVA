package level05;

import java.util.Scanner;

public class BOJ8958 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		String[] testCase = new String[T];
		
		for (int i = 0; i < T; i++)
			testCase[i] = scanner.next();
		
		for (int i = 0; i < T; i++) {
			int score = 0;
			int sum = 0;
			for (int j = 0; j < testCase[i].length(); j++) {
				if (testCase[i].charAt(j) == 'O')
					score++;
				else
					score = 0;
				sum += score;
			}
			System.out.println(sum);
		}
	}
}