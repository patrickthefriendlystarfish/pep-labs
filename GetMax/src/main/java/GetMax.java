public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int max(int[] arr){

        int len = arr.length;
        int minIndex = 0; 
        int temp = 0;
        
        
        for(int i = 0; i < len - 1; i++)
        {
            minIndex = i;
           
            for(int j = i+1; j < len; j++)
            {
                
                if(arr[j] < arr[minIndex])
                {
                    minIndex = j;
                }


                 temp = arr[minIndex];
                 arr[minIndex] = arr[i];
                 arr[i] = temp;

            }

        }

        return arr[len-1];
    }
}
