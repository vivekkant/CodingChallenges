package hackerrank.algorithm.implementation;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();
        
        Calendar actual = new GregorianCalendar(y1, m1 - 1, d1);
        Calendar expected = new GregorianCalendar(y2, m2 - 1, d2);
        
        int fine = 0;
        if (actual.after(expected)) {
        	if (actual.get(Calendar.YEAR) > expected.get(Calendar.YEAR)) {
        		fine = 10000;
        	} else if (actual.get(Calendar.MONTH) > expected.get(Calendar.MONTH)) {
        		fine = 500 * (actual.get(Calendar.MONTH) - expected.get(Calendar.MONTH));
        	} else {
        		fine = 15 * (actual.get(Calendar.DAY_OF_MONTH) - expected.get(Calendar.DAY_OF_MONTH));
        	}
        }
        System.out.println(fine);
    }
}
