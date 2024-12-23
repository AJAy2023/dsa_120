package array_all;

// Q1.largest  number in an array
import java.util.Scanner;
 class max_array {

   public static void main(String[] args) {
        // taking input from the user
        int n;
        System.out.println("enter the size of array");
        Scanner r = new Scanner (System.in);
        n  = r.nextInt();
        int [] array = new int[n];
        for(int i=0; i<n; i++)
        {
            array[i] = r.nextInt();
        }
            int max = array[0];
           
            for(int i=0; i<n; i++)
            {
                if(max<array[i])
                {
                    max = array[i];
                  
                }
              
            }
            System.out.println(max  + " is a largest number of an array");
    }
    //  
}

