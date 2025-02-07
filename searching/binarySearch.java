package searching;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Read the number to search
        int k = sc.nextInt();
        
        // Call binary search and print the result
        System.out.println(binarySearch(arr, k));
        
        sc.close();
    }

    // Binary search function
    public static boolean binarySearch(int[] arr, int k) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == k) {
                return true; // Element found
            } else if (arr[mid] < k) {
                left = mid + 1; // Search in right half
            } else {
                right = mid - 1; // Search in left half
            }
        }

        return false; // Element not found
    }
}
