package hackerrank.contests._101hack48;

import java.util.Scanner;

public class WalkingRobots {

    static int howManyCollisions(String s){

    	char[] robots = s.toCharArray();
    	int collisions = 0;
    	
    	while (isCollisionPossible(robots)) {
	    	int p = 0;
			
	    	while (p < robots.length - 1) {
				if (robots[p] == 'l') {
					p = p + 1;
				} else if (robots[p] == 'r') {
					if (robots[p + 1] == 'l') {
						collisions += 2;
						robots[p] = 'd';
						robots[p + 1] = 'd';
						p = p + 1;
					} else if (robots[p + 1] == 'd') {
						collisions += 1;
						robots[p] = 'd';
						robots[p + 1] = 'd';
						p = p + 1;
					} else if (robots[p + 1] == 'r') {
						p = p + 1;
					}
				} else if (robots[p] == 'd') {
					if (robots[p + 1] == 'l') {
						collisions += 1;
						robots[p] = 'd';
						robots[p + 1] = 'd';
						p = p + 1;
					} else if (robots[p + 1] == 'd') {
						p = p + 1;
					} else if (robots[p + 1] == 'r') {
						p = p + 1;
					}
				}
			} 
		}
		return collisions;
    }
    
    public static boolean isCollisionPossible(char[] robots) {
    	
    	
    	for (int p = 0; p < robots.length - 1; p++) {
    		char first = robots[p];
    		char second = robots[p+1];
    		
    		if ( (first  == 'd' && second == 'l') ||
    			 (first  == 'r' && second == 'l') ||
    			 (first  == 'r' && second == 'd') )
    			return true;
    	}
    	
    	return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            // Returns the number of times moving robots collide.
            int result = howManyCollisions(s);
            System.out.println(result);
        }
    }
}
