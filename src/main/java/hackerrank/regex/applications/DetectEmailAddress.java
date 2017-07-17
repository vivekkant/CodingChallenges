package hackerrank.regex.applications;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectEmailAddress {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int lines = in.nextInt();
		in.nextLine();
		
		Pattern emailpattern = Pattern.compile("[\\w.%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}");
		Set<String> emails = new TreeSet<String>();
		
		for (int i = 0; i < lines; i++) {
			String line = in.nextLine();
			Matcher m = emailpattern.matcher(line);
			while (m.find()) {
				emails.add(m.group());
			}
		}
		
		StringBuilder emaillist = new StringBuilder();
		for (String email : emails) {
			emaillist.append(email).append(';');
		}
		
		System.out.println(emaillist.substring(0, emaillist.length() - 1));
	}

}
