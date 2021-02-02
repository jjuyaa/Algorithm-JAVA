package level07;

import java.util.Scanner;

public class BOJ2941 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String cWord = scanner.next();
		int count = 0;
		
		for (int i = 0; i < cWord.length(); i++) {
			if (cWord.charAt(i) == 'c') {
				if (cWord.charAt(i+1) == '=') {
					count++;
					i = i + 2;
					System.out.println(i + " " + count);
				}
				else if (cWord.charAt(i+1) == '-') {
					count++;
					i = i + 2;
					System.out.println(i + " " + count);
				}
				else
					count++;
			}
			
			else if (cWord.charAt(i) == 'd') {
				if (cWord.charAt(i+1) == 'z') {
					if (cWord.charAt(i+2) == '=') {
						count++;
						i = i + 3;
						System.out.println(i + " " + count);
					}
					else {
						count = count + 2;
						System.out.println(i + " " + count);
						i = i + 2;
					}
				}
				else if (cWord.charAt(i+1) == '-') {
					count++;
					System.out.println(i + " " + count);
					i = i + 2;
				}
				else
					count++;
			}
			
			else if (cWord.charAt(i) == 'l') {
				if (cWord.charAt(i+1) == 'j') {
					count++;
					System.out.println(i + " " + count);
					i = i + 2;
				}
				else
					count++;
			}
			
			else if (cWord.charAt(i) == 'n') {
				if (cWord.charAt(i+1) == 'j') {
					count++;
					System.out.println(i + " " + count);
					i = i + 2;
				}
				else
					count++;
			}
			
			else if (cWord.charAt(i) == 's') {
				if (cWord.charAt(i+1) == '=') {
					count++;
					System.out.println(i + " " + count);
					i = i + 2;
				}
				else
					count++;
			}
			
			else if (cWord.charAt(i) == 'z') {
				if (cWord.charAt(i+1) == '=') {
					count++;
					System.out.println(i + " " + count);
					i = i + 2;
				}
				else
					count++;
			}
			
			else
				count++;
		}	
		
		System.out.println(count);
	}
}