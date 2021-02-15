package BasicMath;

import java.io.*;

public class BOJ1212 {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String S = br.readLine();
		int[] eight = new int[3*S.length()];
		boolean canPrint = false;
		
		for (int i = 0; i < S.length(); i++) {
			switch(S.charAt(i)) {
			case '0':
				eight[3*i] = 0;
				eight[3*i+1] = 0;
				eight[3*i+2] = 0;
				break;
			case '1':
				eight[3*i] = 0;
				eight[3*i+1] = 0;
				eight[3*i+2] = 1;
				break;
			case '2':
				eight[3*i] = 0;
				eight[3*i+1] = 1;
				eight[3*i+2] = 0;
				break;
			case '3':
				eight[3*i] = 0;
				eight[3*i+1] = 1;
				eight[3*i+2] = 1;
				break;
			case '4':
				eight[3*i] = 1;
				eight[3*i+1] = 0;
				eight[3*i+2] = 0;
				break;
			case '5':
				eight[3*i] = 1;
				eight[3*i+1] = 0;
				eight[3*i+2] = 1;
				break;
			case '6':
				eight[3*i] = 1;
				eight[3*i+1] = 1;
				eight[3*i+2] = 0;
				break;
			case '7':
				eight[3*i] = 1;
				eight[3*i+1] = 1;
				eight[3*i+2] = 1;
				break;
			}
		}
		
		for (int i = 0; i < eight.length; i++) {
			if (eight[i] == 0 && canPrint == false)
				if (i == eight.length-1)
					bw.write("0");
				else
					;
			else {
				canPrint = true;
				bw.write(Integer.toString(eight[i]));
			}
		}
		
		bw.flush();
	}
}