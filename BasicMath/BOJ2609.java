package BasicMath;

import java.util.Scanner;

public class BOJ2609 {
	public static long gcd(long a, long b) {
		while (b > 0) {
			long temp = a;
			a = b;
			b = temp % b;
		}
		return a;
	}
	
	public static long lcm(long a, long b, long gcd) {
		return (a*b) / gcd;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		long A = scanner.nextInt();
		long B = scanner.nextInt();
		
		long gcdAB = gcd(Math.max(A, B), Math.min(A, B));
		long lcmAB = lcm(Math.max(A, B), Math.min(A, B), gcdAB);
		
		System.out.println(gcdAB);
		System.out.println(lcmAB);
	}
}