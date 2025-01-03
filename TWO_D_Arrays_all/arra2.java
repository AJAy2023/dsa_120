package TWO_D_Arrays_all;


// IN THIS PROBLEM I AM TAKING THE 2D ARRAY 

public class arra2 {

    public static void main(String[] args) {
        // assigning the array

        int[][] array = {{2,3,4},
                        {4,7,8},
                        {5,6,7},
        {9,4,3}};
   // note :  if you are taking array in your problem then you have to write this two lines 
        int n  = array.length;
        int m  = array[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
      
    }
}