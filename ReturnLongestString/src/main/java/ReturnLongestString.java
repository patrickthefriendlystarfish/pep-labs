import java.util.ArrayList;

public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        int num = arr.length;
        int[] lengthArr = new int[num];
        String longestString;
        String strTemp = "";
        int numTemp = 0;

        for(int count = 0; count < num; count++)
        {
            String temp = arr[count];
            lengthArr[count] = temp.length();

            
        }

        for(int count = 1; count < num; count++)
        {
            if(lengthArr[num-1] > lengthArr[num])
            {
                strTemp = arr[num];
                numTemp = lengthArr[num];

                lengthArr[num] = lengthArr[num - 1];
                arr[num] = arr[num - 1];
                arr[num - 1] = strTemp;
                lengthArr[num - 1] = numTemp;
            }

        }

       
       

    
        
        
        
    }
}
