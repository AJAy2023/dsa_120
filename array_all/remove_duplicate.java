package array_all;

import java.util.Scanner;

public class remove_duplicate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int ans = removeDuplicates(arr);
        System.out.println("Number of unique elements: " + ans);
        
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < ans; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int[] arr) {
        int n = arr.length;

        if (n <= 1) {
            return n;
        }

        // Start from the second element
        int idx = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[idx++] = arr[i];
            }
        }

        return idx;
    }
}
