package hackerrank.contests._30DaysCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexAndDB {
	
	public static List<String> names = new ArrayList<String>();
	public static Pattern emailpattern = Pattern.compile("@gmail.com$");

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            Matcher m = emailpattern.matcher(emailID.toLowerCase());
            if(m.find()) {
            	names.add(firstName);
            }
        }
        Collections.sort(names);
        for(String name : names) {
        	System.out.println(name);
        }
    }

}
