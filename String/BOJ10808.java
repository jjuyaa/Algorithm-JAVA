package String;

import java.util.Scanner;

public class BOJ10808 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] alphabetCount = new int[26];
		for (int i = 0; i < alphabetCount.length; i++) {
			alphabetCount[i] = 0;
		}
		
		String S = scanner.next();
		
		for (int i = 0; i < S.length(); i++) {
			int index = S.charAt(i) - 'a';
			alphabetCount[index] += 1;
		}
		
		for (int i = 0; i < alphabetCount.length; i++){
			System.out.print(alphabetCount[i] + " ");
		}
	}
}