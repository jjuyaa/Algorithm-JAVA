package StackQueueDeck;

import java.io.*;

class Stack {
	private int top;
	private int[] intStack;
	
	Stack(int size) {
		this.top = -1;
		this.intStack = new int[size];
	}
	
	public void push(int X) {
		this.intStack[++top] = X;
	}
	
	public int pop() {
		if (top == -1)
			return -1;
		return this.intStack[top--];
	}
	
	public int size() {
		return this.top+1;
	}
	
	public int empty() {
		if (top == -1)
			return 1;
		else
			return 0;
	}
	
	public int top() {
		if (top == -1)
			return -1;
		else
			return this.intStack[top];
	}
}

public class BOJ10828 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		Stack stack = new Stack(N);
		
		for (int i = 0; i < N; i++) {
			String mission = br.readLine();
			
			if (mission.contains("push")) {
				int X = Integer.parseInt(mission.split(" ")[1]); 
				stack.push(X);
			}
			else if (mission.equals("pop"))
				bw.write(String.valueOf(stack.pop()) + '\n');
			else if (mission.equals("size"))
				bw.write(String.valueOf(stack.size()) + '\n');
			else if (mission.equals("empty"))
				bw.write(String.valueOf(stack.empty()) + '\n');
			else if (mission.equals("top"))
				bw.write(String.valueOf(stack.top()) + '\n');
		}
		bw.flush();
	}
}