package BasicMath;

import java.util.*;

/*
public class BOJ2089 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		List <Integer> list = new ArrayList<>();
		
		if (N == 0)
			System.out.println(N);
		
		while (N != 0) {
			list.add(Math.abs(N % -2));
			N = (int) Math.ceil((double)N / -2);
		}
		
		for (int i = list.size()-1; i >= 0; i--) {
			System.out.print(list.get(i));
		}
	}
}*/

public class BOJ2089 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		long N = scanner.nextLong();
		long remain;
		long[] REMAIN = new long[100];
		int count = 0;
		
		
		if (N == 0)
			System.out.println(N);
		
		while (N != 0) {
			REMAIN[count] = Math.abs(N % (-2));
			N = (int) Math.ceil((double)N / -2);
			count++;
		}
		
		for (int i = count-1; i >= 0; i--) {
			System.out.print(REMAIN[i]);
		}
	}
}