package hackerrank.datastructure.stacks;

import java.util.Scanner;
import java.util.Stack;

public class GameOfTwoStacks {
	
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		int g = in.nextInt();
		while (g-- > 0) {
			int n = in.nextInt();
			int m = in.nextInt();
			int x = in.nextInt();
			
			Stack<Integer> a = populate(n);
			Stack<Integer> b = populate(m);
			
			System.out.println(numberOfMoves(a, b, x));
		}
		
		in.close();
	}
	
	public static int numberOfMoves(Stack<Integer> a, Stack<Integer> b, int x) {
		int moves = 0;
		int sum = 0;
		while (sum < x) {
			if (a.peek() < b.peek()) {
				sum += a.pop();
			} else {
				sum += b.pop();
			}
			moves++;
		}
		
		return moves - 1;
	}
	
	public static Stack<Integer> populate(int n) {

		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < n; i++) {
			stack.push(in.nextInt());
		}
		return reverse(stack);
	}
	
    public static Stack<Integer> reverse(Stack<Integer> inStack) {
    	Stack<Integer> outStack = new Stack<Integer>();
    	while (!inStack.empty())
    		outStack.push(inStack.pop());
    	return outStack;
    }

}
