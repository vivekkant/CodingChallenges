package hackerrank.datastructure.stacks;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		in.nextLine();
		while (n-- > 0) {
			
			
			String brackets = in.nextLine();
			System.out.println(isBalanced(brackets) ? "YES" : "NO");
		}
		
		in.close();

	}
	
	public static boolean isBalanced(String brackets) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for (char bracket : brackets.toCharArray()) {
			if (isOpening(bracket)) {
				stack.push(bracket);
			} else if (isClosing(bracket)) {
				if (!stack.empty() && isClosingMatch(stack.peek(), bracket)) {
					stack.pop();
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
		return stack.isEmpty() ;
	}
	
	public static boolean isOpening(char c) {
		return (c == '{' || c == '(' || c == '[') ;
	}
	
	public static boolean isClosing(char c) {
		return (c == '}' || c == ')' || c == ']') ;
	}
	
	public static boolean isClosingMatch(char c1, char c2) {
		return (c1 == '{' && c2 == '}') ||
			   (c1 == '(' && c2 == ')') ||
			   (c1 == '[' && c2 == ']') ;
	}


}
