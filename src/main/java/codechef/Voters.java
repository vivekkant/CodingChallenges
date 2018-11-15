package codechef;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Voters {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		
		for (int i = 0; i < a; i++) {
			checkAndPut(map,in.nextInt());
		}
		for (int i = 0; i < b; i++) {
			checkAndPut(map,in.nextInt());
		}
		for (int i = 0; i < c; i++) {
			checkAndPut(map,in.nextInt());
		}
		
		Set<Integer> result = new TreeSet<Integer>();
		for (int val : map.keySet()) {
			if (map.get(val) > 1) {
				result.add(val);
			}
		}
		
		System.out.println(result.size());
		for(int val : result) {
			System.out.println(val);
		}
		
		in.close();
	}
	
	public static void checkAndPut(Map<Integer, Integer> map, int val) {
		if (map.containsKey(val)) {
			map.put(val, map.get(val) + 1);
		} else {
			map.put(val, 1);
		}
	}

}
