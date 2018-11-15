package spoj;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class SmallFactorial {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		
		int num = Integer.parseInt(line);
		for(int i = 0; i < num; i++) {
			String input = br.readLine();
			System.out.println(intArrayToNumberString(factorial(Integer.parseInt(input))));
		}

	}
	
	public static int[] factorial(int num) {
		int[] fact = new int[1000];
		fact[0] = 1;
		
		for(int i = 1; i <= num; i++) {
			fact = multiply(fact, i);
		}
		
		return fact;
	}
	
	public static int[] multiply(int[] num, int mult)  {
		int carry = 0;
		for(int i = 0; i < 1000; i++) {
			num[i] = (num[i] * mult) + carry;
			carry = num[i] / 10;
			num[i] = num[i] % 10;
		}
		return num;
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
		return buf.toString();
	}

}
