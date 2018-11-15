package hackerrank.algorithm.implementation;

import java.util.Scanner;

public class LarrysArray {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0) {
            int n = sc.nextInt();
            int values[] = new int[n];
            for (int i = 0; i < n; i++) values[i] = sc.nextInt();
            
            int c = 0;
            for(int i = 0; i < n - 1; i++) {
                for(int j = 0; j < n - i - 1; j++) {
                    if(values[j] > values[j + 1]) {
                        int tp = values[j];
                        values[j] = values[j + 1];
                        values[j + 1] = tp;
                        c++;
                    }
                }
            }
            if(c % 2 == 0) System.out.println("YES");
            else       System.out.println("NO");
        }
    }
}
