package level06;

public class BOJ4673 {
	public static int d(int number) {
		int sum = number;
		
		while (number != 0) {
			sum += number % 10;
			number = number / 10;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		boolean[] isSelfNumber = new boolean[10001];
		
		for (int i = 1; i < 10001; i++) {
			isSelfNumber[i] = true;
		}
		
		for (int i = 1; i < 10001; i++) {
			int num = d(i);
			
			if (num < 10001) {
				isSelfNumber[num] = false;
			}
		}
		
		for (int i = 1; i < 10001; i++) {
			if (isSelfNumber[i] != false)
				System.out.println(i);
		}
	}
}