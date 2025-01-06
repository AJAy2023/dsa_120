package array_all;
import java.util.Scanner;
class reversearray  {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn  = new Scanner(System.in);
        int n  = scn.nextInt();
        int []array = new int[n];
        for(int i=0; i<n; i++)
        {
            array[i] = scn.nextInt();
        }
         int s = scn.nextInt();
        int e = scn.nextInt();
              reversearray(array, s, e);
      printArray(array);
    }
     public static void reversearray(int[] array, int s, int e) {
        int sp = s;
        int ep = e;
        
        // Reverse only the subarray
        while (sp < ep) {
            int temp = array[sp];
            array[sp] = array[ep];
            array[ep] = temp;
            sp++;
            ep--;
        }
}
       public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(" "); // Add space between elements
            }
   
        }
       }
}