
public class vowel_count {

        public static void main(String[] args)
      {
        String  str  = "vijay";
        char  [] str1  = { 'a','e','i','o','u'};
   
        str = str.toLowerCase();   // making the strig to lowercase
        int count = 0;
           for(int i=0; i<str.length(); i++)
         {
            for(int j=0; j<str1.length; j++)
            {
                if( str.charAt(i) == str1[j])
                {
                    count++;
                }
                
            }
           
         }
        System.out.println("the given string count  vowels " +  count);
  
    }
}