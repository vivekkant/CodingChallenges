package spoj;
import java.util.Arrays;


public class SimpleArithmatics {
	
	public static void main(String[] args) {
		
		int[] a = numberStringToIntArray("12034056");
		
		System.out.println(Arrays.toString(a));
		System.out.println(intArrayToNumberString(a));
	}
	
	public static int[] add(int[] first, int[] second) {
		int[] ans = new int[500];
		
		for( int i = 0; i < 500; i++) {
			int carry = 0;
			ans[i] = first[i] + second[i] + carry;
			carry = ans[i] / 10;
			ans[i] = ans[i] % 10;
		}
		
		return ans;
	}
	
	public static String add(String firstStr, String secondStr) {
		StringBuffer buf = new StringBuffer();
		
		int[] first = numberStringToIntArray(firstStr);
		int[] second = numberStringToIntArray(secondStr);
		
		String sum = intArrayToNumberString(add(first, second));
		secondStr = '+' + secondStr;
		
		
		return buf.toString();
	}
	
	public static int[] subtract(int[] first, int[] second) {
		int[] ans = first.length > second.length ? 
				new int[first.length] : 
				new int[second.length];
				
			boolean negetive = compareIntArray(first, second) < 0;
			if (negetive) {
				int[] temp = second;
				second = first;
				first = temp;
			}
				
			int carry = 0;
			
			for( int i = 0; i < ans.length; i++ ) {
				int a = (first.length - 1 - i >= 0) ? 
						 first[first.length - 1 - i] : 0;
				int b = (second.length - 1 - i >= 0) ? 
						second[second.length - 1 - i] : 0;
				int c = a - b + carry;
				
				carry = ( c < 0 ) ? -1 : 0;
				ans[ans.length - 1 - i] = ( c < 0 ) ? c = 10 + c : c;
				
			}
			
		return ans;
	}
	
	public static int compareIntArray(int[] first, int[] second) {
		int result = 0;
		for(int i = first.length - 1; i >= 0; i--) {
			if ( first[i] != second[i]) {
				result = first[i] > second[i] ? 1 : -1;
				break;
			}
		}
		return result;
	}
	
	public static int[] numberStringToIntArray(String numString) {
		int[] array = new int[500];
		
		for (int i = 0; i < numString.length(); i++) {
			array[i] = Integer.parseInt(numString.substring(numString.length() - 1 - i, numString.length() - i));
		}
		
		return array;
	}
	
	public static String intArrayToNumberString(int[] array) {
		StringBuffer buf = new StringBuffer();
		boolean leadingZeros = true;
		for(int i = array.length - 1; i >= 0; i-- ) {
			if (array[i] != 0 || !leadingZeros ) {
				leadingZeros = false;
				buf.append(array[i]);
			}
		}
		if (buf.length() == 0) buf.append('0');
		return buf.toString();
	}

}
