package array_all;
import java.util.Scanner;

class largest_twise {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();  // Read array elements
        }
        
        // Function call and print result
        int result = domainIndex(arr);
        System.out.println("Dominant Index: " + result);
    }

    public static int domainIndex(int[] arr) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        int second = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                second = max;  // Update second largest
                max = arr[i];  // Update largest element
                index = i;     // Update index of the largest
            } else if (arr[i] > second) {
                second = arr[i];  // Update second largest if necessary
            }
        }
        
        // Check if the largest element is at least twice as large as the second largest
        return second * 2 <= max ? index : -1;
    }
}
