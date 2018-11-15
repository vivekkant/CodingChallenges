package hackerrank.regex.applications;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectHTMLLinks {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		in.nextLine();
		
        Pattern patt = Pattern.compile("<\\s*a.*?href=\"(.*?)\".*?>(.*?)</a>");
        
        for (int i = 0; i < testcases; i++) {
        	String line = in.nextLine();
        	
        	Matcher m = patt.matcher(line);
        	
        	while (m.find()) {
        		System.out.println(m.group(1).trim() + "," + m.group(2).replaceAll("<.*?>", "").trim());
        	}
        }
        
	}

}
