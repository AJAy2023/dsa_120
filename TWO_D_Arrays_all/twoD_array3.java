package TWO_D_Arrays_all;

//Q.  Given a 2D array, Print col wise integers.
import java.util.Scanner;

public class twoD_array3 {

    public static void main(String[] args) {
        
        Scanner scn  = new Scanner(System.in);
        int n  = scn.nextInt();
        int m  = scn.nextInt();
        // takign array 
        int [][] arr = new int[n][m];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j<m; j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println("-----------");
        for(int j=0; j<arr[0].length; j++)
        {
            for(int i=0; i<arr.length; i++)
            {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }


    }
}


// assigning the  array in program itself 

// syntax is  
//  int[][] arr = {{1,2,3},{3,4,5}}; this to are the i and j values 