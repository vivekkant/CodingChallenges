package hackerrank.datastructure.stacks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class PoisonousPlants {
	
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		LinkedList<Integer> stack = new LinkedList<Integer>();
		List<LinkedList<Integer>> list = new ArrayList<LinkedList<Integer>>();

		int n = in.nextInt();
		while (n-- > 0) {
			int x = in.nextInt();
			if (stack.isEmpty() || stack.getLast() >= x) {
				stack.add(x);
			}
			else {
				list.add(stack);
				stack = new LinkedList<Integer>();
				stack.addFirst(x);
			}
		}
		if (!stack.isEmpty()) {
			list.add(stack);
		}
		
		int days = 0;
		while (list.size() > 1) {
			for (int i = 1; i < list.size(); i++) {
				stack = list.get(i);
				stack.removeFirst();
				if (!stack.isEmpty() && list.get(i - 1).isEmpty() && list.get(i - 1).getLast() >= stack.getFirst()) {
					list.get(i - 1).addAll(stack);
					stack.clear();
				}
			}
			ListIterator<LinkedList<Integer>> iter = list.listIterator();
			while (iter.hasNext()) {
				if (iter.next().isEmpty()) {
					iter.remove();
				}
			}
			days++;
		}
		
		in.close();
		
		System.out.println(days);
	}

}
