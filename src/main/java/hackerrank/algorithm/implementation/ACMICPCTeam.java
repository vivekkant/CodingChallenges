package hackerrank.algorithm.implementation;

import java.util.BitSet;
import java.util.Scanner;

public class ACMICPCTeam {
    
	public static void main(String[] args) {
        
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        
        BitSet topics[] = new BitSet[n];
        for(int i=0; i < n; i++){
            String value = in.next();
            BitSet topic = new BitSet(m);
            for (int j = 0; j < m; j++) {
            	if (value.charAt(j) == '1') topic.set(j);
            }
            topics[i] = topic;
        }
        
        int maxTopics = 0;
        int maxTeams = 0;
        for (int i = 0; i < n - 1; i++) {
        	for (int j = i + 1; j < n; j++) {
        		BitSet team = (BitSet) topics[i].clone();
        		team.or(topics[j]);
        		int totalTopics = team.cardinality();
        		if (totalTopics > maxTopics) {
        			maxTopics = totalTopics;
        			maxTeams = 1;
        		} else if (totalTopics == maxTopics) {
        			maxTeams++;
        		}
        	}
        }
        System.out.println(maxTopics);
        System.out.println(maxTeams);
    }
}
