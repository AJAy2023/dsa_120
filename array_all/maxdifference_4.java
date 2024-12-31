package array_all;
import java.util.Scanner;
public class maxdifference_4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scn.nextInt();
        }

        int ans1 = maxDiff2(array.clone()); // Use a copy to avoid modifying the original array
        int ans2 = maxDiff3(array.clone()); // Use a copy to avoid modifying the original array
        System.out.println(Math.max(ans1, ans2));
    }

    public static int maxDiff2(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Modify array[i] = array[i] + i
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + i;
        }

        // Find max and min
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        return max - min;
    }

    public static int maxDiff3(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Modify array[i] = array[i] - i
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] - i;
        }

        // Find max and min
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        return max - min;
    }
}
