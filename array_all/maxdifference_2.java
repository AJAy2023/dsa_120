package array_all;

//Q2.Given N array elements, find i,j such that array[i]-array[j]+i-j is max

public class maxdifference_2 {
    public static void main(String[] args) {
        int [] arr =  {2,4,6,8,7,10};

        System.out.println(maxdiff2(arr));
    }

    public static int maxdiff2(int[]arr)
    {
        int min  = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        // updated array values 
        for(int i=0; i<arr.length; i++)
        {
           arr[i] = arr[i]+i;
        }
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }  if(arr[i]<min)
            {
                min  = arr[i];
            }
        }
        return max - min ;
    }
}

// maxdifference 