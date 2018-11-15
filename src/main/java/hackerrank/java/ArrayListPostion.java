package hackerrank.java;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPostion {

	public static void main(String[] args) {
    	
		Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	
    	ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
    	for( int i = 0; i < n; i++ ) {
    		ArrayList<Integer> b = new ArrayList<Integer>();
    		int m = in.nextInt();
    		for(int j = 0; j < m; j++) {
    			int p = in.nextInt();
    			b.add(p);
    			System.out.print(p + " ");
    		}
    		a.add(b);
    		System.out.println();
    	}
    	
    	int q = in.nextInt();
    	System.out.println("rows: " + a.size());
    	System.out.println("Looing for " + q + " recoreds ");
    	for(int i = 0; i < q; i++) {
    		int x = in.nextInt();
    		int y = in.nextInt();
    		if (x <= a.size()) {
    			ArrayList<Integer> b = a.get(x - 1);
    			System.out.println("cols: " + b.size());
    			if(y <= b.size()) {
    				System.out.println(b.get(y - 1));
    			} else {
    				System.out.println("Error!");
    			}
    		} else {
    			System.out.println("Error!");
    		}
    	}

	}

}
