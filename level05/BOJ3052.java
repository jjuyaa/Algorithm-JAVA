package level05;

import java.util.Scanner;

public class BOJ3052 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] remain = new int[10];
		int count = 1;
		
		for (int i = 0; i < 10; i++) {
			int N = scanner.nextInt();
			remain[i] = N % 42;
			
			for (int j = 0; j < i; j++) {
				if (remain[i] == remain[j])
					break;
				else if (j == i - 1) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}