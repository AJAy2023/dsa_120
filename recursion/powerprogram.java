package recursion;

import java.util.Scanner;

//  Given two Integer a and n, find a^n (a raise to power n)
// Note: Use Recursion and Expected Time complexity is O(logN)
public class powerprogram {
    public static void main(String[] args) {
        // taking input 
       Scanner scn  = new Scanner(System.in);
       System.out.println("enter the value of a :");
       int a = scn.nextInt();
       System.out.println("enter the value of n :");
       int n = scn.nextInt();
    //    System.out.println(pow(a,n));
    int ans  = pow(a, n);
    System.out.println("the asn is  : " + ans);
    }
    public static int pow(int a, int n)
    {
        if(n==1)
        {
            return a;
        }

        int temp = pow(a, n/2);
        if(n%2==0)
        {
            return temp * temp;
        }else{
            return temp*temp*a;
        }

    }
}
