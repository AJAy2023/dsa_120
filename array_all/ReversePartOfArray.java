package array_all;

import java.util.Scanner;

public class ReversePartOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Step 1: Input array size
        System.out.println("Enter the size of the array:");
        int n = scn.nextInt();

        // Step 2: Input array elements
        System.out.println("Enter the array elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // Step 3: Input the start and end indices for reversal
        System.out.println("Enter the start index:");
        int start = scn.nextInt();
        System.out.println("Enter the end index:");
        int end = scn.nextInt();

        // Step 4: Call reverse method
        reversePart(arr, start, end);

        // Step 5: Print the resulting array
        System.out.println("Array after reversal:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Method to reverse a part of the array
    public static void reversePart(int[] arr, int start, int end) {
        // Start and end pointers
        int sp = start;
        int ep = end;

        // Swap elements until pointers meet or cross
        while (sp < ep) {
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;

            sp++; // Move start pointer forward
            ep--; // Move end pointer backward
        }
    }
}
