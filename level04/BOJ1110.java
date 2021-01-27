package level04;

import java.util.Scanner;

public class BOJ1110 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int cycle = 0;
		int a, b;
		int c = 0;
		
		a = N;
		
		while(true) {
			b = a / 10 + a % 10;
			c = a % 10 * 10 + b % 10;
			a = c;
			cycle++;
			
			if (c == N)
				break;
		}
		System.out.println(cycle);
	}
}