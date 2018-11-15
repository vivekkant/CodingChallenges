package hackerrank.java;
import java.util.ArrayList;
import java.util.Scanner;

public class ListOperations {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
    	int n = in.nextInt();

    	ArrayList<Integer> a = new ArrayList<Integer>();
    	for( int i = 0; i < n; i++ ) {
    		a.add( in.nextInt() ) ;
    	}
    	
    	int q = in.nextInt();
    	for( int i = 0; i < q; i++ ) {
    		String s = in.next() ;
    		if("Insert".equals(s.trim())) {
    			int p = in.nextInt() ;
    			int o = in.nextInt() ;
    			a.add( p, o ) ;
    		} else {
    			int p = in.nextInt() ;
    			a.remove( p ) ;
    		}
    	}
    	
    	for(int i = 0; i < a.size(); i++ ) {
    		System.out.print( a.get( i ) + " " ) ;
    	}
	}

}
