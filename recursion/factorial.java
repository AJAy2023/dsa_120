package recursion;

// Q1 .the factorail number program using the recusrion 
// input 5 : - 120 


public class factorial {
   public static void main(String[] args) {
     int n  = 5;
    int ans  = facto(n);
    System.out.println("the factorial number is : " + ans);
   }
   public static int facto(int n)
   {
    if(n <= 0)
    {
        return 1;
    }

    int temp  = facto(n-1);
    return temp * n;

   }

}
