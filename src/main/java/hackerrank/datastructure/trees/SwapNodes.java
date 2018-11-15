package hackerrank.datastructure.trees;

import java.util.Scanner;

public class SwapNodes {
	
	public static class Node {
		public int data;
		public Node left;
		public Node right;
	}
	
	public static Scanner in;

	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		Node root = buildTree(in);
		
		int t = in.nextInt();
		int h = height(root);
		
		while (t-- > 0) {
			int k = in.nextInt();
			int s = 1;
			while (k*s <= h) {
				swap(root, k*s); 
				s++;
			}
			printInOrderTraversal(root);
			System.out.println();
		}
				
	}
	
	public static Node buildTree(Scanner in) {
		int n = in.nextInt();
		
		Node[] nodes = new SwapNodes.Node[n + 1];
		for (int i = 1; i < nodes.length; i++) {
			Node node = new Node();
			node.data = i;
			nodes[i] = node;
		}

		for (int i = 1; i < nodes.length; i++) {
			
			Node node = nodes[i];
			
			int l = in.nextInt();
			if (l != -1) {
				node.left = nodes[l];
			}

			int r = in.nextInt();
			if (r != -1) {
				node.right = nodes[r];
			}			
		}
		
		return nodes[1];		
		
	}
	
	public static void swap(Node root, int level) {
		if (root != null) {
			if (level == 1) {
				Node temp = root.left;
				root.left = root.right;
				root.right = temp;
			} else {
				swap(root.left, level - 1);
				swap(root.right, level - 1);
			} 
		}
	}
	
	public static void printInOrderTraversal(Node root) {
		if (root != null) {
			printInOrderTraversal(root.left);
			System.out.print(root.data + " ");
			printInOrderTraversal(root.right);
		}
	}
	
    static int height(Node root) {
        if (root != null) {
            int leftheight = height(root.left) + 1;
            int rightheight = height(root.right) + 1;
            return (leftheight > rightheight) ? leftheight : rightheight;
        }
        return 0;
    }

}
