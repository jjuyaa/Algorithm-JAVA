package BasicMath;

import java.io.*;

public class BOJ1373 {
	public static int whatNum(String s) {
		switch(s) {
		case "000":
			return 0;
		case "001":
			return 1;
		case "010":
			return 2;
		case "011":
			return 3;
		case "100":
			return 4;
		case "101":
			return 5;
		case "110":
			return 6;
		case "111":
			return 7;
		default:
			return 0;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String S = br.readLine();
		String s = "";
		int[] binary = new int[(int) Math.ceil((double)S.length() / 3)];
		int count = 0;
		
		if (S.length() % 3 == 0) {
			for (int i = 0; i < S.length(); i++) {
				s = s + S.charAt(i);
				if (s.length() == 3) {
					binary[count] = whatNum(s);
					count++;
					s = "";
				}
			}
		}
		else if (S.length() % 3 == 1) {
			if (S.charAt(0) == '0')
				binary[0] = 0;
			else {
				binary[0] = 1;
				count++;
			}
			for (int i = 1; i < S.length(); i++) {
				s = s + S.charAt(i);
				if (s.length() == 3) {
					binary[count] = whatNum(s);
					count++;
					s = "";
				}
			}
		}
		else if (S.length() % 3 == 2) {
			s = "0" + S.charAt(0) + S.charAt(1);
			binary[0] = whatNum(s);
			count++;
			s = "";
			for (int i = 2; i < S.length(); i++) {
				s = s + S.charAt(i);
				if (s.length() == 3) {
					binary[count] = whatNum(s);
					count++;
					s = "";
				}
			}
		}

		for (int i = 0; i < binary.length; i++) {
			bw.write(Integer.toString(binary[i]));
		}
		bw.flush();
	}
}