package hackerrank.algorithm.implementation;

import java.util.Scanner;

public class BDayGifts {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            
            long costOfBlack = ((y + z) < x) ? (y + z) : x;
            long costOfWhite = ((x + z) < y) ? (x + z) : y;
            long totalCost = (b * costOfBlack) + (w * costOfWhite);
            System.out.println(totalCost);
            
        }
    }
    
}
