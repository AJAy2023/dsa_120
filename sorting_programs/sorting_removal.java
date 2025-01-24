package sorting_programs;
import java.util.*;
public class sorting_removal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        
        System.out.println(Sortofarray(arr));
    }

    public static int Sortofarray(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int ans = 0;
        
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i] * (n - i);  
            ans = ans + temp;
        }
        
        return ans;
    }
}
