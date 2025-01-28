package all_maths;

import java.util.Scanner;

public class perfectSqr {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        System.out.println( "Enter the number");
        int n  = scn.nextInt();
       boolean result = isperfect(n);
        System.out.println(result);
    }
    public static boolean isperfect(int n)
    {
        if(n<=1)
        {
            return false;
        }
        int i = 1;
        while (i*1 <=n) {
            if(i*i == n)
            {
                return true;
            }
            i++;
        }
        return false;
    }
}
