package recursion;

import java.util.Scanner;

// Print Numbers from N to 1.
//  input 3 : - 3 2 1 
public class decri {
    
    public static void main(String[] args) {
        
        Scanner scn  = new Scanner(System.in);
        int n  = scn.nextInt();
         DecriInt(n);
    }
    public static void DecriInt(int n)
    {
        if(n == 0)
        {
            return ;
        }
        System.out.println(n + " ");
        DecriInt(n -1);
    }
}
