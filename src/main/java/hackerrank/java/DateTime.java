package hackerrank.java;
	import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
	
public class DateTime {

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int month = in.nextInt();
	        int day = in.nextInt();
	        int year = in.nextInt();
	        
	        Calendar c = new GregorianCalendar(year, month - 1, day);
	        DateFormat format = new SimpleDateFormat("EEEE");
	        String weekday = format.format(c.getTime());
	        System.out.println(weekday.toUpperCase());
	    }

}
