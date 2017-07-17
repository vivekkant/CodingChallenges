package hackerrank.java;

import java.security.MessageDigest;
import java.util.Scanner;

class Calculate {
    
    private Scanner in = new Scanner(System.in);
    private static Calculator calc = new Calculator();
    public static Output output = new Output();
    
    public int get_int_val() {
        return in.nextInt();
    }
    
    public double get_double_val() {
        return in.nextDouble();
    }
    
    public static Calculator do_calc() {
    	return calc;
    }
}

class Output {
	public void display(double v) {
		System.out.printf("%.3f%n", v);
	}
}

class Calculator {
	
    public double get_volume(int a) throws NumberFormatException {
    	if (a <= 0) {
    		throw new NumberFormatException("All the values must be positive");
    	}
    	
        double v = 0.0d;
        v = a * a * a;
        return v;
    }
    
    public double get_volume(int l, int b, int h) {
    	if (l <= 0 || b <= 0 || h <= 0) {
    		throw new NumberFormatException("All the values must be positive");
    	}
    	
        double v = 0.0d;
        v = l * b * h;
        return v;
    }
    
    public double get_volume(double r) throws NumberFormatException {
    	if (r <= 0) {
    		throw new NumberFormatException("All the values must be positive");
    	}
    	
        double v = 0.0d;
        v = (2.0/3.0) * Math.PI * r * r * r;
        return v;
    }
    
    public double get_volume(double r, double h) throws NumberFormatException {
    	if (r <= 0 || h <= 0) {
    		throw new NumberFormatException("All the values must be positive");
    	}
    	
        double v = 0.0d;
        v = Math.PI * r * r * h;
        return v;
    }    
    
}

public class VolumeCalculator {
	 public static void main(String[] args) {
		   try {
		    Calculate cal = new Calculate();
		    int T = cal.get_int_val();
		    while (T--> 0) {
		     double volume = 0.0;
		     int ch = cal.get_int_val();
		     if (ch == 1) {
		      int a = cal.get_int_val();
		      volume = Calculate.do_calc().get_volume(a);
		     } else if (ch == 2) {
		      int l = cal.get_int_val();
		      int b = cal.get_int_val();
		      int h = cal.get_int_val();
		      volume = Calculate.do_calc().get_volume(l, b, h);

		     } else if (ch == 3) {
		      double r = cal.get_double_val();
		      volume = Calculate.do_calc().get_volume(r);

		     } else if (ch == 4) {
		      double r = cal.get_double_val();
		      double h = cal.get_double_val();
		      volume = Calculate.do_calc().get_volume(r, h);

		     }
		     cal.output.display(volume);
		    }

		   } catch (NumberFormatException e) {
		    System.out.print(e);
		   }


		  }
}
