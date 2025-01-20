package recursion;

import java.util.Scanner;

//  Given two Integer a and n, find a^n (a raise to power n)
// Note: Use Recursion and Expected Time complexity is O(logN)
public class powerprogram {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        long a = scn.nextLong();  // Use long to handle larger values
        long n = scn.nextLong();
        
        long result = power(a, n);
        System.out.println(result);
    }

    public static long power(long a, long n) {
        // Base case: anything raised to power 0 is 1
        if (n == 0) {
            return 1;
        }
        
        // Recursive calculation
        long temp = power(a, n / 2);
        
        // Combine step
        if (n % 2 == 0) {
            return temp * temp;
        } else {
            return temp * temp * a;
        }
    }
}
