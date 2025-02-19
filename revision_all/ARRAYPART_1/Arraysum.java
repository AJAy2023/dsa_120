

//  ## Given n length Array, You have to return sum of all the elements.
// Sample Input :
// 5
// 10 2 31 6 1
// Sample Output : 

// 50

package ARRAYPART_1;

import java.util.Scanner;

public class Arraysum {

    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        int n  =  scn.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = scn.nextInt();
        }

       int result =  sumofarr(arr);
       System.out.println("the result is :"+ result);
     }

     public static int sumofarr(int [] arr)
     {
        int sum  = 0;
        for(int i=0; i<arr.length; i++)
        {
            sum  = sum+arr[i];
        }
        return sum;
     }
     
}


