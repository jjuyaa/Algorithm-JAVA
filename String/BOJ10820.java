package String;

import java.util.Scanner;

public class BOJ10820 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = 0;
		int[] lower = new int[100];
		int[] upper = new int[100];
		int[] number = new int[100];
		int[] blank = new int [100];
		
		String S = "";
		
		while (scanner.hasNext()) {
			int lowerCount = 0;
			int upperCount = 0;
			int numberCount = 0;
			int blankCount = 0;
			
			S = scanner.nextLine();
			for (int i = 0; i < S.length(); i++) {
				if (S.charAt(i) >= 'a' && S.charAt(i) <= 'z')
					lowerCount++;
				else if (S.charAt(i) >= 'A' && S.charAt(i) <= 'Z')
					upperCount++;
				else if (S.charAt(i) >= '0' && S.charAt(i) <= '9')
					numberCount++;
				else if (S.charAt(i) == ' ')
					blankCount++;
			}
			
			lower[N] = lowerCount;
			upper[N] = upperCount;
			number[N] = numberCount;
			blank[N] = blankCount;
			System.out.println(lower[N] + " " + upper[N] + " " + number[N] + " " + blank[N]);
			N++;
		}
	}
}