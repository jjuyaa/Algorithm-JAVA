package String;

import java.io.*;

public class  BOJ10824B{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] nums = br.readLine().split(" ");
		
		String ab = nums[0] + nums[1];
		String cd = nums[2] + nums[3];
		
		
		long AB = Long.parseLong(ab);
		long CD = Long.parseLong(cd);
		long sum = AB + CD;
		bw.write(sum + "\n");
		bw.flush();

	}
}