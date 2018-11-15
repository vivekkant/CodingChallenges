package hackerrank.regex.applications;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindAWord {
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		in.nextLine();
		
		
		String[] sentences = new String[testcases];
		
		for (int i = 0; i < testcases; i++) {
			sentences[i] = in.nextLine();
		}
		
        int queryCount = Integer.parseInt(in.nextLine());
        while(queryCount-- > 0) {
            int matches = 0;
            String word = in.nextLine();
            
            Pattern p = Pattern.compile("\\b" + word + "\\b");
            
            for(int j = 0 ; j < testcases ; j++)
            {
                Matcher m = p.matcher(sentences[j]);
                while( m.find())
                    matches++;
            }
            System.out.println(matches);
        }
	}

}
