package hackerrank.regex.applications;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlienUsername {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		in.nextLine();
		
		Pattern p = Pattern.compile("^[_.][0-9]+[a-zA-Z]*?_?$");
		
		 while(testcases-- > 0) {
			 String username = in.nextLine();
			 Matcher m = p.matcher(username);
			 System.out.println(m.find() ? "VALID" : "INVALID");
		 }
	}

}
