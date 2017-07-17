package hackerrank.algorithm.implementation;

import java.util.Scanner;

public class CustomEncryption {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        
        char[] chars = s.replaceAll("\\s", "").toCharArray();
        double root = Math.sqrt((double)chars.length);
        int rows = (int) Math.floor(root);
        int cols = (int) Math.ceil(root);
        
        while (rows * cols < chars.length) {
        	if (rows < cols) rows++; else cols++;
        }
        
        for (int col = 0; col < cols; col++) {
        	for (int row = 0; row < rows; row++) {
        		int index = (row * cols) + col;
        		
        		if (index < chars.length) {
        			System.out.print(chars[index]);
        		}
        	}
        	System.out.print(" ");
        }
    }
}
