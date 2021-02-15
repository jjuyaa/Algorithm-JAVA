package String;

import java.util.Scanner;

public class BOJ10824 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String line = scanner.nextLine();
		String[] nums = line.split(" ");
		
		String A = nums[0];
		String B = nums[1];
		String C = nums[2];
		String D = nums[3];
		
		long AB = Integer.parseInt(A+B);
		long CD = Integer.parseInt(C+D);
		
		System.out.println(AB + CD);
	}
}