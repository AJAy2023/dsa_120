package array_all;

import java.util.Scanner;

//Q1. Solution Vid: https://youtu.be/_Dj2BNXTzCY  

public class largest_twice {

    public static void main(String[] args) {
        Scanner scn  =  new Scanner(System.in);
        int n  =  scn.nextInt();
        System.out.println("enter the array number ");
        int [] array = new int[n];
        for(int i=0; i<n; i++)
        {
            array[i] = scn.nextInt();
        }
        System.out.println(array_index(array));
    }
    public static int array_index(int []array)
    {
      int max = Integer.MIN_VALUE; // small value ;
      int index = -1;
      int second = -1;
      for(int i=0; i<array.length; i++)
      {
       if(array[i]>max)
       {
         second = max; // hold the max value
          max = array[i]; // store the max value 
          index =  i;
       } else if(array[i]>second)
       {
           second = array[i];
       } 
      }
      return second * 2 <= max ? index : -1;     
    }
}
//reference _ hw : =  https://youtu.be/_Dj2BNXTzCY 