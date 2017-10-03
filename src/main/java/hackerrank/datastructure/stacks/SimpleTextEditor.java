package hackerrank.datastructure.stacks;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {
	
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		String current = "";
		
		int n = in.nextInt();
		while (n-- > 0) {
			
			int action = in.nextInt();
			switch (action) {
				case 1:	String st = in.next();
						stack.push(current);
						current += st;
						break;
				
				case 2:	int delete = in.nextInt();
						stack.push(current);
						current = current.substring(0, current.length() - delete);
						break;
				
				case 3: int index = in.nextInt();
						System.out.println(current.charAt(index - 1));
						break;
						
				case 4: current = stack.pop();
						break;
			}
				
		}

		in.close();
	}

}
