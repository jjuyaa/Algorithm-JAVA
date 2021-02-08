package sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ11651 {
	static class Point {
		int x;
		int y;
		
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		static Comparator<Point> x_order = new Comparator<Point>() {
			@Override
			public int compare(Point o1, Point o2) {
				return o1.x - o2.x;
			}
		};
		
		static Comparator<Point> y_order = new Comparator<Point>() {
			@Override
			public int compare(Point o1, Point o2) {
				return o1.y - o2.y;
			}
		};
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		Point[] points = new Point[N];
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			String[] s = str.split(" ");
			
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			
			points[i] = new Point(a, b);
		}
		
		Arrays.sort(points, Point.x_order);
		Arrays.sort(points, Point.y_order);
		
		for (int i = 0; i < N; i++) {
			bw.write(Integer.toString(points[i].x) + ' ');
			bw.write(Integer.toString(points[i].y) + '\n');
		}
		bw.flush();
	}
}