package hackerrank.contests._30DaysCode;

import java.util.Scanner;

public class Hourglass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < 5; i++) {
        	for (int j = 1; j < 5; j++) {
        		int sum = sumHourGlass(arr, i, j);
        		max = sum > max ? sum : max;
        	}
        }
        
        System.out.println(max);
        
    }
    
    public static int sumHourGlass(int[][] arr, int i, int j) {
    	return 	arr[i - 1][j - 1] + arr[i - 1][j] + arr[i - 1][j + 1] +
    								arr[i][j] +
    			arr[i + 1][j - 1] + arr[i + 1][j] + arr[i + 1][j + 1];
    }

}
