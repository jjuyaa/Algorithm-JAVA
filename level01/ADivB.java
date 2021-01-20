package level01;

// BOJ #1008
import java.util.Scanner;

public class ADivB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println(a / (double)b);
	}
}