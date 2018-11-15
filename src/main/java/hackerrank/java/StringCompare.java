package hackerrank.java;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringCompare {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = scanner.nextInt();
        
        String min = s.substring(0,n);
        String max = min ;
        
        for( int i=0; i < (s.length() - n + 1); i++) {
            String sub = s.substring(i, i+n) ;
            if (sub.compareTo(max) > 0 ) max = sub;
            if (sub.compareTo(min) < 0 ) min = sub;
            System.out.println("-->" + sub);
        }
        System.out.println(min);
        System.out.println(max);
        
    }
}