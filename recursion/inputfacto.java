package recursion;

import java.util.Scanner;

// Q3.  Take as input n  : -  Print n!
public class inputfacto {
    
    public static void main(String[] args) {
        System.out.println("enter the number ");
        Scanner scn  = new Scanner(System.in);
        int n  = scn.nextInt();
            int ans  = facto(n);
            System.out.println(ans);
    }
        
    public static int facto(int n)
    {
        if(n<=0)
        {
            return 1;
        }
        int temp  = facto(n-1);
        return temp * n;
    }
}
