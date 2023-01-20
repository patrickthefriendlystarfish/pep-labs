public class IsSorted {
    /**
     * Return true if arr is sorted, smallest to largest, false otherwise.
     * For example, {1,2,3,4} is storted but {1,2,4,3} is unsorted
     *
     * @param arr an int array
     * @return true if arr is sorted (all the numbers are in order). false if arr is not sorted.
     */
    public boolean checkSort(int[] arr){
        

        for(int count = 0; count < arr.length; count ++)
        {
            int currentArr = arr[count];
            int nextArr = arr[count + 1];

            if(currentArr > nextArr)
            {
                return false;
            }


        }

        return true;
    }
}
