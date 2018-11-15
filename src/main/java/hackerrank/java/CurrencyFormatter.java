package hackerrank.java;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat usnf = NumberFormat.getCurrencyInstance( new Locale("en", "US") );
        String us = usnf.format(payment) ;
        
        NumberFormat innf = NumberFormat.getCurrencyInstance( new Locale("en", "IN") );
        String india = innf.format(payment) ;
        
        NumberFormat chnf = NumberFormat.getCurrencyInstance( new Locale("en", "CHN") );
        String china = '�' + chnf.format(payment).substring(1) ;
        
        NumberFormat frnf = NumberFormat.getCurrencyInstance( new Locale("fr", "FR") );
        String france = frnf.format(payment) ;
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
