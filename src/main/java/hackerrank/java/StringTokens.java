package hackerrank.java;
import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        String[] tokens = s.trim().split("[ !,?._'@]+");
        System.out.println(tokens.length);
        for( String token : tokens) {
        	System.out.println(token);
        }
        
        scan.close();
    }
}