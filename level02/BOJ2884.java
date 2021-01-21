package level02;

import java.util.Scanner;

public class BOJ2884 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int hour = scanner.nextInt();
		int minute = scanner.nextInt();
		
		if ((minute - 45) >= 0)
			System.out.println(hour + " " + (minute - 45));
		else {
			if ((hour - 1) >= 0)
				System.out.println((hour - 1) + " " + (minute + 15));
			else
				System.out.println("23 " + (minute + 15));
		}
	}
}