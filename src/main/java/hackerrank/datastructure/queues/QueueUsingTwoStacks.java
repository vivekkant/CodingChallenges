package hackerrank.datastructure.queues;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStacks {
	
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		Stack<Integer> fQueue = new Stack<Integer>();
		Stack<Integer> bQueue = new Stack<Integer>();
		
		int n = in.nextInt();
		while (n-- > 0) {
			int op = in.nextInt();
			
			switch (op) {
			case 1 : 
				int x = in.nextInt();
				enqueue(fQueue, x);
				break;
			case 2 :
				dequeue(fQueue, bQueue);
				break;
			case 3 :
				System.out.println(top(fQueue, bQueue));
			}
		}
		
		in.close();
	}
	
	public static void enqueue(Stack<Integer> queue, int x) {
		queue.push(x);
	}
	
	public static int dequeue(Stack<Integer> fQueue, Stack<Integer> bQueue) {
		if (bQueue.empty()) {
			while (!fQueue.empty()) {
				bQueue.push(fQueue.pop());
			}
		}
		return bQueue.pop();
	}
	
	public static int top(Stack<Integer> fQueue, Stack<Integer> bQueue) {
		if (bQueue.empty()) {
			while (!fQueue.empty()) {
				bQueue.push(fQueue.pop());
			}
		}
		return bQueue.peek();
	}


}
