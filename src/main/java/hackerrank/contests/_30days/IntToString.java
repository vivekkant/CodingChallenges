package hackerrank.contests._30days;
import java.util.Scanner;

public class IntToString {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        try {
			int i = Integer.parseInt(s);
			System.out.println(i);
		} catch (NumberFormatException e) {
			System.out.println("Bad String");
		}
	}

}
