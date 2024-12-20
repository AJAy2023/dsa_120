
package array_all;

import java.util.Scanner;

public class array01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scn.nextInt();

        // Declare the array
        int arr[] = new int[n];

        // Input elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
         
        }

        // Calculate the sum
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        // Output the sum
        System.out.println("Sum of array elements: " + sum);
    }
    
}
