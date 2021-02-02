package level07;

import java.util.Scanner;

public class BOJ5622 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String word = scanner.next();
		int sum = 0;
		int num;
		int[] wordNum = new int[word.length()];
		
		for (int i = 0; i < word.length(); i++) {
			num = word.charAt(i) - 'A';
			if (num >= 0 && num < 3)
				wordNum[i] = 2;
			else if (num >= 3 && num < 6)
				wordNum[i] = 3;
			else if (num >= 6 && num < 9)
				wordNum[i] = 4;
			else if (num >= 9 && num < 12)
				wordNum[i] = 5;
			else if (num >= 12 && num < 15)
				wordNum[i] = 6;
			else if (num >= 15 && num < 19)
				wordNum[i] = 7;
			else if (num >= 19 && num < 22)
				wordNum[i] = 8;
			else if (num >= 22 && num < 26)
				wordNum[i] = 9;
		}
		
		for (int i = 0; i < wordNum.length; i++) {
			sum += (wordNum[i] + 1);
		}
		
		System.out.println(sum);
	}
}