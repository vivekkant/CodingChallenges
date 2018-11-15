package mcq;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPattern {
	private static final String ORIGIN_PATTERN = "\\.(cognizant.com$)";
	
	public static void main(String[] args) {
		System.out.print(isValidOrigin("abc123.cognizant.com"));
		System.out.print(", " + isValidOrigin (".cognizantc20.com"));		 
		System.out.print(", " + isValidOrigin ("www.cognizant.com."));
		System.out.print(", " + isValidOrigin ("abc%.cognizant.com"));	
    }	
	public static boolean isValidOrigin (String domain) {		 
		Pattern regexOrigin = Pattern.compile(ORIGIN_PATTERN); 		
		Matcher matcher = regexOrigin.matcher(domain);		
		return matcher.find();
	}
 }

