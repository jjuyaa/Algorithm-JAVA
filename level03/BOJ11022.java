package level03;

import java.util.Scanner;

public class BOJ11022 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		int[] Ainput = new int[T];
		int[] Binput = new int[T];
		int[] Csum = new int[T];
		
		for (int i = 0; i < T; i++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			Ainput[i] = A;
			Binput[i] = B;
			Csum[i] = A + B;
		}
		
		for (int i = 0; i < T; i++)
			System.out.println("Case #" + (i+1) + ": " + Ainput[i] + " + " + Binput[i] + " = " + Csum[i]);
	}
}