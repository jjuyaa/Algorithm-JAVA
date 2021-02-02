package level07;

import java.util.Scanner;

public class BOJ1152 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numWord = 0;
		String S = scanner.nextLine();
		
		String[] Sarray = S.split(" ");
		
		for (int i = 0; i < Sarray.length; i++) {
			if (Sarray[i] == "")
				numWord = numWord;
			else
				numWord++;
		}
		
		System.out.println(numWord);
	}
}