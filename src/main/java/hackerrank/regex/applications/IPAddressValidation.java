package hackerrank.regex.applications;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAddressValidation {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		in.nextLine();
		
		Pattern ipv4 = Pattern.compile("^(([01]?\\d?\\d|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d?\\d|2[0-4]\\d|25[0-5])$");
		Pattern ipv6 = Pattern.compile("^([\\da-f]{1,4}:){7}([\\da-f]{1,4})$");
		
		for (int i = 0; i < testcases; i++) {
			String address = in.nextLine().trim();
			if (ipv4.matcher(address).find()) {
				System.out.println("IPv4");
			}
			else if (ipv6.matcher(address).find()) {
				System.out.println("IPv6");
			} 
			else {
				System.out.println("Neither");
			}
		}
	}

}
