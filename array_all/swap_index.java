package array_all;

import java.util.Scanner;

// crate the array and swap the index of an array 
public class swap_index {
    
    public static void main(String[] args) {
        
          
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int[] arr = new int[n];
       for(int i=0;i<n;i++){
           arr[i] = scn.nextInt();
       }
       int idx1 = scn.nextInt();
       int idx2 = scn.nextInt();
       
       int temp = arr[idx1];
       arr[idx1] = arr[idx2];
       arr[idx2] = temp;
       
        for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
       }

   }
           
    }

    

