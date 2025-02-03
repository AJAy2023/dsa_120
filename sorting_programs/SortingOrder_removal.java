
package sorting_programs;

import java.util.Arrays;
import java.util.Scanner;

public class SortingOrder_removal {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scn.nextInt();
        }
        scn.close();

        System.out.println(minCostToRemove(array));
    }

    public static int minCostToRemove(int[] array) {
        Arrays.sort(array); 

        int totalSum = 0;
        for (int num : array) {
            totalSum += num;
        }

        int cost = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            cost += totalSum; 
            totalSum -= array[i]; 
        }

        return cost;
    }
}