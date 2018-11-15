package hackerrank.datastructure.stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class EqualStacks {
	
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		int s = 3;
		int[] n = new int[s];		
		int[] h = new int[s];
		for (int i = 0; i < 3; i++) {
			n[i] = in.nextInt();
		}
		List<Stack<Integer>> stacks = populate(n, h);
		int maxCommonHeight = findMaxCommonHeight(stacks, h, s);
		System.out.println(maxCommonHeight);
		
		in.close();
	}
	
	public static List<Stack<Integer>> populate(int[] n, int[] h) {
		List<Stack<Integer>> stacks = new ArrayList<Stack<Integer>>();
		for (int i = 0; i < 3; i++) {
			Stack<Integer> stack = new Stack<Integer>();
			for (int j = 0; j < n[i]; j++) {
				stack.push(in.nextInt());
				h[i] += stack.peek();
			}
			stacks.add(reverse(stack));
		}
		return stacks;
	}
	
	public static int findMaxCommonHeight(List<Stack<Integer>> stacks, int[] h, int s) {
		while (!isEqualHeight(h)) {
			int maxIndex = maxHeightIndex(h);
			int x = stacks.get(maxIndex).pop();
			h[maxIndex] -= x;
		}
		
		return h[0];
	}
	
	public static boolean isEqualHeight(int[] h) {
		boolean equal = true;
		int p = h[0];
		for (int i = 0; i < h.length; i++) {
			if (p != h[i]) {
				equal = false;
				break;
			}
		}
		
		return equal;
	}
	
	public static int maxHeightIndex(int[] h) {
		int index = 0;
		int max = h[0];
		for (int i = 0; i < h.length; i++) {
			if (h[i] > max) {
				index = i;
				max = h[i];
			}
		}
		
		return index;
	}
    
    public static Stack<Integer> reverse(Stack<Integer> inStack) {
    	Stack<Integer> outStack = new Stack<Integer>();
    	while (!inStack.empty())
    		outStack.push(inStack.pop());
    	return outStack;
    }

}
