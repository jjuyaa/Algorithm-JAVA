package sorting;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ10825 {
	static class Student {
		String name;
		int korean;
		int english;
		int math;
		
		Student(String name, int korean, int english, int math) {
			this.name = name;
			this.korean = korean;
			this.english = english;
			this.math = math;
		}
		
		static Comparator<Student> korean_des_order = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o2.korean - o1.korean;
			}
		};
		
		static Comparator<Student> english_order = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.english - o2.english;
			}
		};
		
		static Comparator<Student> math_des_order = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o2.math - o1.math;
			}
		};
		
		static Comparator<Student> name_order = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.name.compareTo(o2.name);
			}
		};
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		Student[] students = new Student[N];
		
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			String[] ss = s.split(" ");
			
			String name = ss[0];
			int korean = Integer.parseInt(ss[1]);
			int english = Integer.parseInt(ss[2]);
			int math = Integer.parseInt(ss[3]);
			
			students[i] = new Student(name, korean, english, math);
		}
		
		Arrays.sort(students, Student.name_order);
		Arrays.sort(students, Student.math_des_order);
		Arrays.sort(students, Student.english_order);
		Arrays.sort(students, Student.korean_des_order);
		
		for (int i = 0; i < N; i++)
			bw.write(students[i].name + '\n');
		bw.flush();
	}
}