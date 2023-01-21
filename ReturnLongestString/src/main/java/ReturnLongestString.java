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

        for(int count = 0; count < num; count++)
        {
            String temp = arr[count];
            lengthArr[count] = temp.length();

        }
        for(int count = 1; count < num; count++)
        {
            if(lengthArr[count - 1] > lengthArr[count])
            {
                String strtemp = arr[count];
                int inttemp = lengthArr[count];

                lengthArr[count] = lengthArr[count - 1];
                arr[count] = arr[count - 1];

                arr[count] = strtemp;
                lengthArr[count] = inttemp;
            }
            
        }

        for(int count = 0; count < arr.length; count++)
        {
            System.out.println(arr[count]);
            System.out.println(lengthArr[count]);
        }
        
        
        return arr[arr.length - 1];
    }
}
