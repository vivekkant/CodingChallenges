package codechef;

import java.util.Scanner;

public class TheLeadGame {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = -1;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int p1 = in.nextInt();
            int p2 = in.nextInt();
            int lead = 0;
            if (p1 > p2) {
               lead = p1 - p2;
               if (lead > max) {
                   p = 1;
                   max = lead;
               }
            } else {
                lead = p2 - p1;
                if (lead > max) {
                    p = 2;
                    max = lead;
                }
            }
        }
        System.out.println(p + " " + max);
        
        in.close();
    }

}
