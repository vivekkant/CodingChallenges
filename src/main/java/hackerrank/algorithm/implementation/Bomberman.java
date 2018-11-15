package hackerrank.algorithm.implementation;

import java.util.Scanner;

public class Bomberman {

    public static void blast(char[][] grid, int r, int c){
        
    	for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(grid[i][j]=='O'){
                    if(i-1>=0 && grid[i-1][j]!='O') grid[i-1][j]='*';
                    if(i+1<r && grid[i+1][j]!='O') grid[i+1][j]='*';
                    if(j-1>=0 && grid[i][j-1]!='O') grid[i][j-1]='*';
                    if(j+1<c && grid[i][j+1]!='O') grid[i][j+1]='*';
                }
            }
        }
    	
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(grid[i][j]=='.') grid[i][j]='O';
                else if(grid[i][j]=='O' || grid[i][j]=='*') grid[i][j]='.';
            }
        }
    }
    
    public static void toFull(char[][] grid, int r, int c){
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                grid[i][j]='O';
            }
        }
    }
    
    public static void main(String[] args) {
        
    	Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int n = in.nextInt();
        
        in.nextLine();
        char[][] grid = new char[r][c];
        for(int i=0; i<r; i++){
            grid[i] = in.nextLine().toCharArray();
        }
        
        if(n%2 == 0) toFull(grid, r, c);
        if(n%4 == 3) blast(grid, r, c);
        if(n%4 == 1 && n!=1){
            blast(grid, r, c);
            blast(grid, r, c);
        }
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
}
