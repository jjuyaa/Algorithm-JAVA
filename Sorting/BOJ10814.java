package sorting;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ10814 {
	static class OnlineJudge {
		int age;
		String name;
		
		OnlineJudge(int age, String name) {
			this.age = age;
			this.name = name;
		}
		
		static Comparator<OnlineJudge> member_order = new Comparator<OnlineJudge>(){
			@Override
			public int compare(OnlineJudge o1, OnlineJudge o2) {
				return o1.age - o2.age;
			}
		};
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		OnlineJudge[] OnlineJudges = new OnlineJudge[N];
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			String[] s = str.split(" ");
			
			int age = Integer.parseInt(s[0]);
			String name = s[1];
			
			OnlineJudges[i] = new OnlineJudge(age, name);
		}
		
		Arrays.sort(OnlineJudges, OnlineJudge.member_order);
		
		for (int i = 0; i < N; i++) {
			bw.write(Integer.toString(OnlineJudges[i].age) + ' ');
			bw.write(OnlineJudges[i].name + '\n');
		}
		bw.flush();
	}
}