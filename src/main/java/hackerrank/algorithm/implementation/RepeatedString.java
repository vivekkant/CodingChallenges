package hackerrank.algorithm.implementation;

import java.util.Scanner;

public class RepeatedString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        
        int length = s.length();
        int countInString = countOfAInString(s);
        
        long totalAs = (n / length) * countInString; //base
        
        int deltaLength = (int) (n % length);
        for (int i = 0; i < deltaLength; i++) {
        	if (s.charAt(i) == 'a') totalAs++;
        }
        
        System.out.println(totalAs);
    }
    
    public static int countOfAInString(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
        	if (c == 'a') count++;
        }
        return count;
    }
}
