package hackerrank.algorithm.implementation;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CutSticks {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
        	int key = in.nextInt();
        	int value = (map.containsKey(key)) ? map.get(key) : 0;
        	map.put(key, value + 1);
        }

        int count = n;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        	System.out.println(count);
        	count = count - entry.getValue();
        }
	}

}
