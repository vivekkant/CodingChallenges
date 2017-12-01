package hackerrank.contests._30DaysCode;

import java.util.Scanner;

public class Bitwise {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0){
            int n = in.nextInt();
            int k = in.nextInt();
            int max = 0;
            for (int i = 1; i < n; i++) {
            	for (int j = i + 1; j <= n; j++) {
            		if ( (i&j) < k ) {
            			max = max > (i&j) ? max : (i&j);
            		}
            	}
            }
            System.out.println(max);
        }
    }

}
