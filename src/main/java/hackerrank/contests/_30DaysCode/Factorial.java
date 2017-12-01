package hackerrank.contests._30DaysCode;

import java.util.Scanner;

public class Factorial {

    static int factorial(int n) {
        int fact = 1;
        if (n <= 1) return fact;
        else return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }

}
