package level07;

import java.util.Scanner;

public class BOJ2675 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		
		int[] R = new int[T];
		String[] S = new String[T];
		
		for (int i = 0; i < T; i++) {
			R[i] = scanner.nextInt();
			S[i] = scanner.next();
		}
		
		for (int i = 0; i < T; i++) {
			for (int j = 0; j < S[i].length(); j++) {
				for (int r = 0; r < R[i]; r++)
					System.out.print(S[i].charAt(j));
			}
			System.out.println();
		}
	}
}