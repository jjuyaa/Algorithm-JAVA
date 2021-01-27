package level04;

import java.util.Scanner;

public class BOJ10951 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] sumOutput = new int[100];
		int count = 0;
		
		while(scanner.hasNextInt()) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			int sum = A + B;
			sumOutput[count] = sum;
			count++;
		}
		
		int i = 0;
		while(i < count) {
			System.out.println(sumOutput[i]);
			i++;
		}
	}
}