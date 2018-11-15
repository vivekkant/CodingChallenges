package hackerrank.algorithm.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        
        long[] list = {a, b, c, d, e};
        Arrays.sort(list);
        System.out.print(list[0] + list[1] + list[2] + list[3] + " ");
        System.out.println(list[1] + list[2] + list[3] + list[4]);
        
    }
}
