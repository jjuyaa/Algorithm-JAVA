package level07;

import java.util.Scanner;

public class BOJ2908 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int temp;
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		int newA = (A % 10) * 100 + (A / 10 % 10) * 10 + (A / 100);
		int newB = (B % 10) * 100 + (B / 10 % 10) * 10 + (B / 100);
		
		if (newA > newB)
			System.out.println(newA);
		else
			System.out.println(newB);
	}
}