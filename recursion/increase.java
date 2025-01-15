package recursion;

import java.util.Scanner;

//Q1. Print numbers from 1 to N in N lines
// simple input :- 4 output => 1 2 3 4 
public class increase {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        int n  = scn.nextInt();

         pritIncr(n);
           
    }

    public static int pritIncr(int n)
    {
        if( n<=0)
        {
            return 1;
        }
        pritIncr(n-1);
        System.out.println(n);
        return n;
    }

}
