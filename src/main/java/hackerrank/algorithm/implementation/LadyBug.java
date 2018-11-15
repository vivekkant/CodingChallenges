package hackerrank.algorithm.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LadyBug {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		
		for (int t = 0; t < testcases; t++) {
			in.nextInt();
			String board = in.next();
			System.out.println(isHappinessPossible(board) ? "YES" : "NO");
		}
	}
	
	public static boolean isAlreadyHappy(String board) {
		
		if (board.length() == 1) return false; //single ladybug can never be happy
		
		for (int i = 0; i < board.length(); i++) {
			if (i == 0) {
				if (board.charAt(i) != board.charAt(i + 1))
					return false;
			} else if (i == board.length() - 1) {
				if (board.charAt(i) != board.charAt(i - 1))
					return false;
			} else {
				if (board.charAt(i) != board.charAt(i - 1) && board.charAt(i) != board.charAt(i + 1))
					return false;
			}
			
		}
		return true;
	}
	
	public static boolean isHappinessPossible(String board) {
		
		if (isAlreadyHappy(board)) return true;

		Map<Character, Integer> pieces = new HashMap<Character, Integer>();
		for (char piece : board.toCharArray()) {
			if (pieces.containsKey(piece)) {
				pieces.put(piece, pieces.get(piece) + 1);
			} else {
				pieces.put(piece, 1);
			}
		}
		
		if (!pieces.containsKey('_')) {
			return false;
		} else {
			for (char piece : pieces.keySet()) {
				if (piece != '_' && pieces.get(piece) == 1) {
					return false;
				}
			}
		}
		
		return true;
	}
	
}
