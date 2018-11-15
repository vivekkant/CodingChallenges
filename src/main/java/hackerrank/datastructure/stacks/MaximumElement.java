package hackerrank.datastructure.stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MaximumElement {

	public static void main(String[] args) {
		
        java.util.Stack<Integer> s = new java.util.Stack<Integer>();
        java.util.Stack<Integer> max = new java.util.Stack<Integer>();
            
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i=0; i<n; i++) {
            int c = in.nextInt();
            switch (c) {
                case 1: 
                    int value = in.nextInt();
                    s.push(value);
                    if (max.size() == 0 || max.peek() <= value) max.push(value);
                    break;
                case 2: 
                    int removed = s.pop();
                    if (max.peek() == removed) max.pop();
                    break;
                case 3:
                    System.out.println(max.peek());
                    break;
            }
        }
		
	}
}
