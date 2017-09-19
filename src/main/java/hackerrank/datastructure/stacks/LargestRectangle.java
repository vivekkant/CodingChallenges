package hackerrank.datastructure.stacks;

import java.util.Scanner;
import java.util.Stack;

public class LargestRectangle {

	public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int[] hist = new int[n + 1];
        for( int i = 0; i < n; i++) {
        		hist[i] = in.nextInt();
        }
        hist[n] = 0;
        
        System.out.println(getMaxArea(hist));
        
        in.close();
	}
	
	public static int getMaxArea(int[] hist) {
        Stack<Integer> stack = new Stack<>();
        int max = -1;
        for(int height : hist) {
            int n = 0;
            while(!stack.isEmpty() && stack.peek() > height) {
                n++;
                max = Math.max(max, n * stack.pop());
            }
            for(int i = 0; i < n+1; i++) {
                stack.push(height);
            }
        }
        return max;
	}

}
