package level05;

import java.util.Scanner;

public class BOJ2577 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		int X = A * B * C;
		
		int[] numCount = new int[10];
		
		for (int i = 0; i < 10; i++)
			numCount[i] = 0;
		
		while (X / 10 != 0) {
			numCount[X % 10]++;
			X = X / 10;
		}
		numCount[X]++;
		
		for (int i = 0; i < 10; i++)
			System.out.println(numCount[i]);
	}
}