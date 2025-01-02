package TWO_D_Arrays_all;

import java.util.Scanner;

public class twoD_1 {

    public static void main(String[] args) {
        // Taking values from the user
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of rows (n):");
        int n = scn.nextInt();
        System.out.println("Enter the number of columns (m):");
        int m = scn.nextInt();

        if (n <= 0 || m <= 0) {
            System.out.println("Number of rows and columns must be positive.");
            scn.close();
            return;
        }

        int[][] array = new int[n][m];
        System.out.println("Enter the elements of the 2D array row by row:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scn.nextInt();
            }
        }

        System.out.println("The 2D array is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        scn.close();
    }
}
