package BasicMath;

import java.util.Scanner;

public class BOJ11005 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		long N = scanner.nextInt();
		int B = scanner.nextInt();
		
		char[] remain = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
		               'A', 'B', 'C', 'D' ,'E', 'F', 'G' ,'H', 'I', 'J', 
		               'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 
		               'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		long[] output = new long[1000000];
		int count = 0;
		
		while (N > 0) {
			output[count] = remain[N%B];
			N = N / B;
			count++;
		}
		
		for (int i = count; i > 0; i--)
			System.out.print(output[i]);
	}
}