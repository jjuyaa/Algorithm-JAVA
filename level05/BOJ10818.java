package level05;

import java.util.Scanner;

public class BOJ10818 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int[] num = new int[N];
		
		num[0] = scanner.nextInt();
		int min = num[0];
		int max = num[0];
		
		for (int i = 1; i < N; i++) {
			num[i] = scanner.nextInt();
			
			if (num[i] < min)
				min = num[i];
			if (num[i] > max)
				max = num[i];
		}
		
		System.out.println(min + " " + max);
	}
}