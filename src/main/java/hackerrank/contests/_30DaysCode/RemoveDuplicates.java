package hackerrank.contests._30DaysCode;

import java.util.Scanner;

class Node5{
	int data;
	Node5 next;
	Node5(int d){
        data=d;
        next=null;
    }
	
}

public class RemoveDuplicates {

    public static Node5 removeDuplicates(Node5 head) {
        
    	if (head == null) return head;
    	Node5 curr = head;
    	while (curr != null) {
    		if (curr.next != null && curr.data == curr.next.data) {
    			curr.next = curr.next.next;
    		} else {
    			curr = curr.next;
    		}
    	}
    	
    	return head;
    }
    
    public static  Node5 insert(Node5 head,int data)
    {
        Node5 p=new Node5(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node5 start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node5 head)
        {
              Node5 start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
        public static void main(String args[])
        {
              Scanner sc=new Scanner(System.in);
              Node5 head=null;
              int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  head=insert(head,ele);
              }
              head=removeDuplicates(head);
              display(head);

       }

}
