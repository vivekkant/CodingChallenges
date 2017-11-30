package hackerrank.contests._30days;
import java.util.Scanner;

class Node3 {
	int data;
	Node3 next;
	Node3(int d) {
        data = d;
        next = null;
    }
}

public class LinkedList {
	
    public static Node3 insert(Node3 head,int data) {
        Node3 node = new Node3(data);
        
        if (head == null) {
        		head = node;
        }
        else {
            Node3 curr = head;
            while (curr.next != null) {
            		curr = curr.next;
            }
            curr.next = node;        	
        }
    	
    		return head;
    }

	
	public static void display(Node3 head) {
        Node3 start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node3 head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }

}
