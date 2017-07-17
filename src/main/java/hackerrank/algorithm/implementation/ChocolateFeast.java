package hackerrank.algorithm.implementation;

import java.util.Scanner;

public class ChocolateFeast {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int money = in.nextInt();
            int dollarCost = in.nextInt();
            int wrapperCost = in.nextInt();
            
            int chocs = money / dollarCost;
            int wrappers = chocs;
            while (wrappers >= wrapperCost) {
            	int chocsBought = wrappers / wrapperCost;
            	chocs += chocsBought;
            	wrappers = (wrappers % wrapperCost) + chocsBought;
            }
            System.out.println(chocs);
        }
    }
}
