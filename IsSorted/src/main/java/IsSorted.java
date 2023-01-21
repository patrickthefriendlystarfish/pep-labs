public class IsSorted {
    /**
     * Return true if arr is sorted, smallest to largest, false otherwise.
     * For example, {1,2,3,4} is storted but {1,2,4,3} is unsorted
     *
     * @param arr an int array
     * @return true if arr is sorted (all the numbers are in order). false if arr is not sorted.
     */
    public boolean checkSort(int[] arr){
        

      for(int i = 0; i < arr.length; i+=2)
      {
        for(int j = 1; j < arr.length - 1; j+=2)
        {
            int currentArr = arr[i];
            int nextArr = arr[j];
            System.out.println("Current Arr: " + currentArr);
            System.out.println("NextArr: " + nextArr);
            
            if(currentArr > nextArr)
            {
                return false;
            }
        }
      }

        return true;
    }
}
