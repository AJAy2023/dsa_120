package TWO_D_Arrays_all;

import java.util.Scanner;

public class User_Zigzag {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        int n  = scn.nextInt();
        int m  = scn.nextInt();
        int [][] array  = new int[n][m];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                 array[i][j] = scn.nextInt(); 
            }
        }
          n =array.length;
        m = array[0].length; 
        System.out.println("--------------");
        for(int i=0; i<n; i++)
        {
            if(i %2 ==0)
            {
                for(int j=0; j<m; j++)
                {
                    System.out.print(array[i][j] + " ");
                }
            } else{
                for(int j = m-1; j>=0; j--)
                {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
      
    }
}
