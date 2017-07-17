package spoj;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class NextNumericPalindrome {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		
		int num = Integer.parseInt(line);
		for(int i = 0; i < num; i++) {
			String input = br.readLine();
			System.out.println(getNextPalindrome(input.toCharArray()));
		}

	}
	
	public static String getNextPalindrome(char[] input) {
		
		StringBuilder buf = new StringBuilder();
		
		boolean even = input.length % 2 == 0;
		char[] left = substring(input, 0, input.length/2);
		char[] right = substring(input, (input.length + 1)/2, input.length);
		char middle = !even ? input[input.length/2] : (char)-1;
		
		char[] leftrev = reverse(left);
		if (compareCharArray(leftrev, right) < 0 ) {
			buf.append(left);
			if (!even) buf.append(middle);
			buf.append(leftrev);
		} else {
			//Increment the left part and reset the right part
			char[] leftandmiddle = null;
			if(even) {
				leftandmiddle = left;
			} else {
				leftandmiddle = new char[left.length + 1];
				for(int i = 0; i < left.length; i++) {
					leftandmiddle[i] = left[i];
				}
				leftandmiddle[left.length] = middle;
			}
			char[] incrementedleft = increment(leftandmiddle);
			char[] out = new char[incrementedleft.length +  right.length];
			for (int i = 0 ; i < out.length; i++) {
				if ( i < incrementedleft.length ) {
					out[i] = incrementedleft[i];
				} else {
					out[i] = '0';
				}
			}
			return getNextPalindrome(out);
		}
		
		return buf.toString();
	}
	
	/**
	 * Reverses and array
	 * 
	 * @param input
	 * @return
	 */
	public static char[] reverse(char[] input) {
		char[] out = new char[input.length];
		for(int i = 0; i < input.length; i++) {
			out[i] = input[input.length - i - 1];
		}
		return out;
	}
	
	/**
	 * compares two arrays
	 * 
	 * @param left
	 * @param right
	 * @return -1 if left is larger, 1 if right is larger 0 if they are equal
	 */
	public static int compareCharArray(char[] left, char[] right) {
		int result = 0;
		int len = (left.length < right.length)?left.length:right.length;
		
		for(int i = 0; i < len; i++) {
			if(left[i] > right[i]) {
				result = -1;
				break;
			} else if(left[i] < right[i]) {
				result = 1;
				break;
			} else {
				continue;
			}
		}
		return result;
	}
	
	public static char[] substring(char[] input, int start, int end) {
		char[] out = new char[end - start];
		for(int i = start; i < end; i++) {
			out[i - start] = input[i];
		}
		return out;
	}
	
	public static char[] increment(char[] input) {
		
		char carry = '0';
		for(int i = input.length - 1; i >= 0; i--) {
			if(input[i] == '9') {
				input[i] = '0';
				if (i == 0) {
					carry = '1';
				}
			} else {
				input[i]++;
				break;
			}
		}
		
		//If carry we have to modify the array
		if(carry == '1') {
			char[] out = new char[input.length + 1];
			out[0] = carry;
			for(int i = 1; i < out.length; i++) {
				out[i] = input[i - 1];
			}
			return out;
		} else {
			return input;
		}
	}
	

}
