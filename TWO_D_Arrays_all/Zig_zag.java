package TWO_D_Arrays_all;

public class Zig_zag {

    public static void main(String[] args) {

        // Initializing the array
        int[][] arr = {
            {10, 20, 30, 40},
            {60, 70, 80, 90},
            {110, 120, 130, 140},
            {160, 170, 180, 190}
        };

        // Number of rows
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Print left-to-right for even rows
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                // Print right-to-left for odd rows
                for (int j = arr[i].length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
      
    }
}
