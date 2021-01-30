package level07;

import java.util.Scanner;

public class BOJ10809 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] alphabet = new int[26];
		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = -1;
		}
		
		String S = scanner.next();
		for (int i = 0; i < S.length(); i++) {
			int index = S.charAt(i) - 'a';
			if (alphabet[index] == -1)
				alphabet[index] = i;
		}
		
		for (int i = 0; i < alphabet.length; i++)
			System.out.print(alphabet[i] + " ");
	}
}