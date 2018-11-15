package hackerrank.java;
import java.util.Scanner;
import java.util.Stack;

public class BalancedStrings {

	public static void main(String[] args) {

	      Scanner sc = new Scanner(System.in);
	      
	      while (sc.hasNext()) {
	         String input=sc.next();
	         char[] a = input.trim().toCharArray() ;
	         Stack<Character> s = new Stack<Character>() ;
	         try {
				for( int i = 0; i < a.length; i++ ) {
					 char c = a[i] ;
					 switch( c ) {
					 	case '{' :
					 		s.push( c ) ;
					 		break ;
					 	case '(' :
					 		s.push( c ) ;
					 		break ;
					 	case '[' :
					 		s.push( c ) ;
					 		break ;
					 	case ']' :
					 		if( s.peek() == '[' ) s.pop() ;
					 		break ;
					 	case ')' :
					 		if( s.peek() == '(' ) s.pop() ;
					 		break ;
					 	case '}' :
					 		if( s.peek() == '{' ) s.pop() ;
					 		break ;
					 }
				 
				 }
				 System.out.println( s.empty() ) ;
			} catch (Exception e) {
				System.out.println( false ) ;
			}
	      }
	}

}
