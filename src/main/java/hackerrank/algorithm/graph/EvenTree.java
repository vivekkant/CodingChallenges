package hackerrank.algorithm.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EvenTree {
	
	private static Map<Integer, Set<Integer>> edges = null;
	private static int evenSubTrees = 0;

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	int m = in.nextInt();
    	
    	edges = new HashMap<Integer, Set<Integer>>();
    	for (int i = 0; i < m; i++) {
    		int u = in.nextInt();
    		int v = in.nextInt();
    		
    		if(!edges.containsKey(u)) edges.put(u, new HashSet<Integer>());
    		if(!edges.containsKey(v)) edges.put(v, new HashSet<Integer>());
    		
    		edges.get(u).add(v);
    		edges.get(v).add(u);
    	}
    	
		removeParent(1);
		length(1);
		
		System.out.println(evenSubTrees - 1);
    	
    }
    
    private static void removeParent(int parent) {
    	for(int child : edges.get(parent)) {
    		edges.get(child).remove(parent);
    		removeParent(child);
    	}
    }
    
    private static int length(int root) {
    	int len = 1;
    	for(int child : edges.get(root)) {
    		len = len + length(child);
    	}
    	
    	if (len % 2 == 0) evenSubTrees++ ;
    	
    	return len;
    }
    
    
}
