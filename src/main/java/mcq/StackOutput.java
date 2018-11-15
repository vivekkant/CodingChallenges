package mcq;

import java.util.Stack;

public class StackOutput {

	public static void main(String[] args) {
        Stack<Integer> obj = new Stack<Integer>();
        obj.push(new Integer(1));
        obj.push(new Integer(2));
        obj.pop();
        obj.push(new Integer(3));
 	    System.out.println(obj);
	}

}
