package spoj;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Factorial {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		
		int num = Integer.parseInt(line);
		for(int i = 0; i < num; i++) {
			String input = br.readLine();
			System.out.println(fractalZeros(Integer.parseInt(input)));
		}
	}
	
	public static int fractalZeros(int num) {
		int numZeros = 0;
		int power = 1;
		int div = 0;
		while (div < num) {
			div = power(5, power);
			numZeros += (num / div) ;
			power++;
		}
		
		return numZeros;
	}
	
	public static int power(int base, int pow) {
		return (pow == 0) ? 1 : base * power(base, pow - 1);
	}

}
