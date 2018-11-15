package hackerrank.java;
import java.util.Scanner;

class HRJavaLoops{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int sum = a + b ;
            System.out.print(sum) ;
            
            for (int j=1; j<n; j++) {
                sum = sum + b * ( power (2, j) ) ;
                System.out.print( " " + sum ) ;
            }
            System.out.println();
        }
        in.close();
    }
    
    public static int power( int a, int b) {
        int res = 1 ;
        for( int i = 0; i < b; i++) {
            res = res * a ;
        }
        
        return res ;
    }
}
