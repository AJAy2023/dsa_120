package array_all;
public class maxdifference_3 {
    
    public static void main(String[] args) {
      int [] array = {2,3,4,5,6,8,2};
      System.out.println(maxdiff(array));   
    }

    public static int maxdiff(int[]array)
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++)
        {
            array[i] = array[i] -i;
        }
        for(int i=0; i<array.length; i++)
        {
            if(array[i]>max)
            {
                max = array[i];
            }
            if(array[i]<min)
            {
                min  = array[i];
            }
        }
        return max - min;
    }
}


 /* 
  Given n length array "arr". Find (i,j) with maximum value of arr[i] - arr[j] + j - i. You need to print max value of (arr[i] - arr[j] + j - i) possible and not the (i,j) itself

  our equation  is (arr[i]-arr[j]+j-i) =>  arr[i]-i -arr[j]-j  i.e. i need to update the arr[i]
 */