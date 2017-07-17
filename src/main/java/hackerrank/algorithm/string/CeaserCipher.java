package hackerrank.algorithm.string;

import java.util.Scanner;

public class CeaserCipher {
	
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    char[] s = in.next().toCharArray();
	    int k = in.nextInt();
	    
	    for (char plaintext : s) {
	    	char ciphertext = plaintext;
			if ((plaintext >= 65 && plaintext <= 90) || (plaintext >= 97 && plaintext <= 122)) {
				char base = (plaintext > 'Z') ? 'a' : 'A';
				ciphertext = (char) (base + ((plaintext - base + k) % 26));
			}
	    	System.out.print(ciphertext);
	    }
	    System.out.println();
		
	}

}
