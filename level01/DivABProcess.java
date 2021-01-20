package level01;

// BOJ #2588
import java.util.Scanner;

public class DivABProcess {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println(a * (b % 10));
		System.out.println(a * (b / 10 % 10));
		System.out.println(a * (b / 100));
		System.out.println(a * b);
	}
}