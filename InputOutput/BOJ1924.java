package io;

import java.util.Scanner;

public class BOJ1924 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		int day = 0; 
		
		if (x == 1)
			day += y;
		else if (x == 2)
			day += 31 + y;
		else if (x <= 8)
			if (x == 3)
				day += 31 + 28 + y;
			else
				day += 28 + 31 * (x / 2) + 30 * ((x-3) / 2) + y;
		else
			day += 28 + 31 * ((x+1) / 2) + 30 * ((x-4) / 2) + y;
		
		switch (day % 7) {
		case 0:
			System.out.println("SUN");
			break;
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("THU");
			break;
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("SAT");
			break;
		}
	}
}