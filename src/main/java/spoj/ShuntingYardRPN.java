package spoj;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;


public class ShuntingYardRPN {
	
	public static String alphabets = "abcdefghijklmnopqrstuvwxyz";
	public static String operands = "+-*/^";

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		
		int num = Integer.parseInt(line);
		for(int i = 0; i < num; i++) {
			String prefix = br.readLine();
			System.out.println(shuntingYardAlgo(prefix));
		}
		
	}

	/**
	 * This is the implementation of an abridged version of shunting yard
	 * algorithm.
	 * 
	 * @param input
	 * @return
	 */
	public static String shuntingYardAlgo(String input) {
		StringBuilder out = new StringBuilder();
		Stack<Character> st = new Stack<Character>();
		
		char[] tokens = input.trim().toCharArray();
		for(int i = 0; i < tokens.length; i++) {
			char token = tokens[i];
			if (token == '(') {
				st.push(token);
			} else if (alphabets.indexOf(token) != -1) {
				out.append(token);
			} else if (operands.indexOf(token) != -1) {
				st.push(token);
			} else if (token == ')') {
				char stToken;
				while((stToken = st.pop()) != '(') {
					out.append(stToken);
				}
			}
		}
		
		return out.toString();
	}
}
