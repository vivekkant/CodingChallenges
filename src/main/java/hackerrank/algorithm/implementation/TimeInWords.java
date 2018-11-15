package hackerrank.algorithm.implementation;

import java.util.Scanner;

public class TimeInWords {
	
	public static String[] MINUTES_IN_WORDS = {
			"~1 o' clock", 					//0
			"one minute past ~1", 			//1
			"two minutes past ~1",
			"three minutes past ~1",
			"four minutes past ~1",
			"five minutes past ~1",
			"six minutes past ~1",
			"seven minutes past ~1",
			"eight minutes past ~1",
			"nine minutes past ~1",
			"ten minutes past ~1",
			"eleven minutes past ~1",
			"twelve minutes past ~1",
			"thirteen minutes past ~1",
			"fourteen minutes past ~1",			
			"quarter past ~1",				//15
			"sixteen minutes past ~1",
			"seventeen minutes past ~1",
			"eighteen minutes past ~1",
			"nineteen minutes past ~1",
			"twenty minutes past ~1",		//20
			"twenty one minutes past ~1",
			"twenty two minutes past ~1",
			"twenty three minutes past ~1",
			"twenty four minutes past ~1",
			"twenty five minutes past ~1",	//25
			"twenty six minutes past ~1",
			"twenty seven minutes past ~1",
			"twenty eight minutes past ~1",
			"twenty nine minutes past ~1",
			"half past ~1",					//30
			"twenty nine minutes to ~2",	//31
			"twenty eight minutes to ~2",	
			"twenty seven minutes to ~2",	
			"twenty six minutes to ~2",	
			"twenty five minutes to ~2",	//35
			"twenty four minutes to ~2",	
			"twenty three minutes to ~2",	
			"twenty two minutes to ~2",	
			"twenty one minutes to ~2",	
			"twenty minutes to ~2",			//40
			"nineteen minutes to ~2",	
			"eighteen minutes to ~2",	
			"seventeen minutes to ~2",	
			"sixteen minutes to ~2",	
			"quarter to ~2",				//45
			"forteen minutes to ~2",	
			"thirteen minutes to ~2",	
			"twelve minutes to ~2",	
			"eleven minutes to ~2",	
			"ten minutes to ~2",			//50
			"nine minutes to ~2",
			"eight minutes to ~2",
			"seven minutes to ~2",
			"six minutes to ~2",
			"five minutes to ~2",			//55
			"four minutes to ~2",
			"three minutes to ~2",
			"two minutes to ~2",
			"one minute to ~2",
	};
	
	public static String[] HOUR_IN_WORDS = {
		"", "one", "two", "three", "four", "five", "six", 
		"seven", "eight", "nine", "ten", "eleven", "twelve"
	};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        
        String template = MINUTES_IN_WORDS[m];
        String inWords = template.replaceAll("~1", HOUR_IN_WORDS[h]).replaceAll("~2", HOUR_IN_WORDS[h + 1]);
        System.out.println(inWords);
    }
    
}
