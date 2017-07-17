package hackerrank.algorithm.string;

import java.util.Scanner;

public class CamelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	if (c >= 'A' && c <= 'Z') {
        		num++;
        	}
        }
        System.out.println(num + 1);
    }
}