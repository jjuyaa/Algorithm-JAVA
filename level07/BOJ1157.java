package level07;

import java.util.Scanner;

public class BOJ1157 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] alphabet = new int[26];
		
		int index;
		int max = -1;
		char chAlphabet = '?';
		
		String S = scanner.next();
		
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) >= 'A' && S.charAt(i) <= 'Z') 
				alphabet[S.charAt(i) - 'A']++;
			else
				alphabet[S.charAt(i) - 'a']++;
		}
		
		for (int i = 0; i < 26; i++) {
			if (alphabet[i] > max) {
				max = alphabet[i];
				chAlphabet = (char) (i + 65);
			}
			else if (alphabet[i] == max)
				chAlphabet = '?';
		}
		
		System.out.println(chAlphabet);
	}
}