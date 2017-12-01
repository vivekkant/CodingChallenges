package hackerrank.contests._30DaysCode;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Node2 {
	Node2 left,right;
    int data;
    Node2(int data){
        this.data=data;
        left=right=null;
    }
}

public class BSTLevelOrder {
	
	static Queue<Node2> queue = new ArrayDeque<Node2>();
	
	static void levelOrder(Node2 root){
		if (root != null) queue.add(root);
		while (!queue.isEmpty()) {
			Node2 node = queue.poll();
			System.out.println(node.data);
			if (node.left != null) queue.add(node.left);
			if (node.right != null) queue.add(node.right);
		}
	}

	public static Node2 insert(Node2 root,int data){
       if(root == null){
            return new Node2(data);
        }
        else{
            Node2 cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node2 root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }	

}
