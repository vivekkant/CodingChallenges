package hackerrank.java;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class DQueueExample {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<Integer>();
        int n = in.nextInt();
        int m = in.nextInt();

        int max = 0 ;
        Set<Integer> st = new HashSet<Integer>() ;
        for (int i = 0; i < n; i++) {
            int coming = in.nextInt();
            if( i < m ) {
            	deque.addLast( coming ) ;
            	if ( deque.size() == m ) {
            		st.addAll( deque ) ;
            	}
            } else {
            	
            	int going = deque.getFirst() ;
            	deque.removeFirst() ;
            	deque.addLast( coming ) ;
            	
            	if( !deque.contains( going ) ) {
            		st.remove( going ) ;
            	}
            	st.add( coming ) ;
            }
            max =st.size() > max ? st.size() : max ;
        }
        System.out.println( max ) ;
    }
    

}
