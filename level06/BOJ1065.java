package level06;

import java.util.Scanner;

public class BOJ1065 {
	public static boolean isHanNumber(int number) {
		int num1 = number / 100;
		int num2 = number / 10 % 10;
		int num3 = number % 10;
		
		if (num2 * 2 == num1 + num3)
			return true;

		return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int count = 0;
		
		if (N < 100)
			count = N;
		else {
			count = 99;
			
			for (int i = 100; i <= N; i++) {
				if (isHanNumber(i) == true)
					count++;
			}
		}
		
		System.out.println(count);
	}
}