package BasicMath;

import java.util.Scanner;

public class BOJ1934 {
	public static int gcd(int a, int b) {
		while (b > 0) {
			int temp = a;
			a = b;
			b = temp % b;
		}
		return a;
	}
	
	public static int lcm(int a, int b, int gcd) {
		return a * b / gcd;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		int[] LCM = new int[T];
		
		for (int i = 0; i < T; i++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			
			LCM[i] = lcm(Math.max(A, B), Math.min(A, B), gcd(A, B));
		}
		
		for (int i = 0; i < T; i++) {
			System.out.println(LCM[i]);
		}
	}
}