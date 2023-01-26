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
        int[] length = new int[arr.length];
        String strTemp = "";
        int lengthTemp = 0;
        for(int count = 0; count < arr.length; count++)
        {
            length[count] = arr[count].length();
        }

        for(int count = 1; count < arr.length; count++)
        {
            if(length[count - 1] > length[count])
            {
                lengthTemp = length[count];
                strTemp = arr[count];
                length[count] = length[count - 1];
                arr[count] = arr[count - 1];
                arr[count - 1] = strTemp;
                length[count - 1] = lengthTemp;
            }
        }

        

       
       

    
        
        
        
    }
}
