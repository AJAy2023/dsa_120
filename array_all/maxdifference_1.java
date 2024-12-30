package array_all;
public class maxdifference_1 {

    public static void main(String[] args) {
        
        int [] array = {3,9,8,1};
        System.out.println(maxdiff(array));
    }
    public static int maxdiff(int[]array)
    {
        int max = Integer.MIN_VALUE;
        int min  = Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++)
        {
            if(array[i]>max)
            {
                max = array[i];
            } 
            if(array[i]<min){
                min = array[i];
            }

        }
        return max- min;
    }
    
}


// explanation : -  maximum diffrence between the largest and smallest number is na array 
// ex array = {2,3,5,7,8,1} max = 8 and min  = 1  max_diffrence = max - min => 7 is ans 
