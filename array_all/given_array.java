//Q1. in this quetion array is given you have to swap the index of an given array


package array_all;

import java.util.Arrays;

public class given_array {

    public static void main(String[] args) {
        int [] array = {2,3,4,5,6};
        int temp = array[0];
        array[0] = array[4];
        array[4] = temp;

        System.out.println(Arrays.toString(array));
      
    }
}

/* 
note : 

When to Use Arrays.toString(array)
If you want to see the contents of the array in a readable format (e.g., [6, 3, 4, 5, 2]), you must use Arrays.toString(array) from the java.util package.

*/