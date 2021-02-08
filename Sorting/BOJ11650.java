package sorting;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ11650 {
	static class Point {
		int x;
		int y;
		
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		static final Comparator<Point> y_order = new Comparator<Point>() {
			@Override
			public int compare(Point o1, Point o2) {
				return o1.y - o2.y;
			}
		};
		
		static final Comparator<Point> x_order = new Comparator<Point>() {
			@Override
			public int compare(Point o1, Point o2) {
				return o1.x - o2.x;
			}
		};
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		Point[] array = new Point[N];
		String[] s;
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			s = str.split(" ");
			
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			array[i] = new Point(a, b);
		}
		
		Arrays.sort(array, Point.y_order);
		Arrays.sort(array, Point.x_order);
		
		for (int i = 0; i < N; i++) {
			bw.write(Integer.toString(array[i].x));
			bw.write(" ");
			bw.write(Integer.toString(array[i].y));
			bw.write("\n");
		}
		bw.flush();
	}
}