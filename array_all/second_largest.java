package array_all;

import java.util.Scanner;

//Q1. second largest number in an array in  this quetion we are solving same problem in an two way one is better and optimal approach 
// 1. better approach 
public class second_largest {
        public static void main(String[] args) {
        Scanner scn  =  new Scanner(System.in);
        System.out.println("enter the array size");
        int n  = scn.nextInt();
        System.out.println("enter the array elements");
        int [] array = new int[n];
        for(int i=0; i<n; i++)
        {
            array[i] = scn.nextInt();
        }
        scn.close();
        System.out.println(functionlargest(array));
    }

    public static int functionlargest(int[] array)
    {
        int max= array[0];
        int second_larg = -1;
        for(int i=0; i<array.length; i++)
        {
            if(array[i]>max)
            {
                max = array[i];
            }
        }
        for(int i=0; i<array.length; i++)
        {
            if(array[i]>second_larg && array[i]<max)
            {
                second_larg = array[i];
            }
        }
        return second_larg;
    }
}
