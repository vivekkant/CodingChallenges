package hackerrank.regex.applications;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectHTMLTags {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		in.nextLine();
		
		//Pattern patt = Pattern.compile("<\\s*a.*?href=\"(.*?)\".*?>(.*?)</a>");
		Pattern patt1 = Pattern.compile("<\\s*([a-zA-Z0-9]+)\\s*.*?>");
		
		Set<String> tags = new TreeSet<String>();
		
		for (int i = 0; i < testcases; i++) {
			String line = in.nextLine();
			//System.out.println(line);
			Matcher m = patt1.matcher(line);
			while (m.find()) {
				String tag = m.group(1).trim();
				//System.out.println(tag);
				tags.add(tag);
			}
		}
		
		StringBuffer taglist = new StringBuffer();
		for (String tag : tags) {
			taglist.append(tag).append(';');
		}
		
		System.out.println(taglist.substring(0, taglist.length() - 1));
	}
}
