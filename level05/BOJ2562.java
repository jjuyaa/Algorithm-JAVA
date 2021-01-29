package level05;

import java.util.Scanner;

public class BOJ2562 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] numArray = new int[9];
		
		numArray[0] = scanner.nextInt();
		int max = numArray[0];
		int index = 1;
		
		for (int i = 1; i < 9; i++) {
			numArray[i] = scanner.nextInt();
			if (numArray[i] > max) {
				max = numArray[i];
				index = i + 1;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
	}
}