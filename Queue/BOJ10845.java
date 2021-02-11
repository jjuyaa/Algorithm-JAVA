package StackQueueDeck;

import java.io.*;

class Queue {
	int front;
	int back;
	int[] intQueue;
	
	Queue(int size) {
		this.front = 0;
		this.back = -1;
		intQueue = new int[size];
	}
	
	public void push(int X) {
		intQueue[++back] = X;
	}
	
	public int pop() {
		if (empty() == 1)
			return -1;
		else
			return intQueue[front++];
	}
	
	public int size() {
		return back - front + 1;
	}
	
	public int empty() {
		if (size() == 0)
			return 1;
		else
			return 0;
	}
	
	public int front() {
		if (empty() == 1)
			return -1;
		else
			return intQueue[front];
	}
	
	public int back() {
		if (empty() == 1)
			return -1;
		else
			return intQueue[back];
	}
}

public class BOJ10845 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		Queue queue = new Queue(N);
		
		for (int i = 0; i < N; i++) {
			String mission = br.readLine();
			
			if (mission.contains("push")) {
				String[] pushItem = mission.split(" ");
				int X = Integer.parseInt(pushItem[1]);
				queue.push(X);
			}
			else if (mission.equals("pop"))
				bw.write(Integer.toString(queue.pop()) + '\n');
			else if (mission.equals("size"))
				bw.write(Integer.toString(queue.size()) + '\n');
			else if (mission.equals("empty"))
				bw.write(Integer.toString(queue.empty()) + '\n');
			else if (mission.equals("front"))
				bw.write(Integer.toString(queue.front()) + '\n');
			else if (mission.equals("back"))
				bw.write(Integer.toString(queue.back()) + '\n');
		}
		bw.flush();
	}
}