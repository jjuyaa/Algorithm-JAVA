package level04;

import java.util.Scanner;

public class BOJ10952 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A, B, sum;
		int i = 0;
		int count = 1;
		int[] Ainput = new int[100];
		int[] Binput = new int[100];
		int[] sumOutput = new int[100];
		
		A = scanner.nextInt();
		B = scanner.nextInt();
		
		Ainput[0] = A;
		Binput[0] = B;
		sum = A + B;
		sumOutput[0] = sum;
		
		while (sum != 0) {
			A = scanner.nextInt();
			B = scanner.nextInt();
			
			Ainput[count] = A;
			Binput[count] = B;
			sum = A + B;
			sumOutput[count] = sum;
			count++;
		}
		
		while (i < count - 1) {
			System.out.println(sumOutput[i]);
			i++;
		}
	}
}