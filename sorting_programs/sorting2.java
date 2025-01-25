package sorting_programs;
import java.util.Arrays;
import java.util.Scanner;

public class sorting2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = scn.nextInt();
        }
        
        scn.close();  // Close the scanner after reading input
        
        System.out.println(calculateSortedSum(array, n));
    }

    public static int calculateSortedSum(int[] array, int n) {
        Arrays.sort(array);  // Sort the array in ascending order
        
        int ans = 0;
        for (int i = 0; i < n; i++) {  
            ans += array[i] * (n - i);  
        }
        
        return ans;
    }
}
