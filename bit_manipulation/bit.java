//  Take as input a number n. Determine whether it is even or odd. If it is even, 
// print "even" otherwise print "odd".
package  bit_manipulation;

import java.util.*;
public class bit {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scn = new Scanner(System.in);
        
    
        int n = scn.nextInt();
        
        // Determine and print whether the number is even or odd
        if (isEven(n)) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        
        // Close the scanner
        scn.close();
    }

    // Method to check if a number is even
    public static boolean isEven(int n) {
        // Check the least significant bit using bitwise AND
        return (n & 1) == 0;
    }
}
