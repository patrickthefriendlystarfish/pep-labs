
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        System.out.println("Called combine()");
        int newLen = arr1.length + arr2.length;
        System.out.println("new length: " + newLen);
        int[] newArr = new int[newLen];
        boolean arr1read = false;

        for(int count = 0; count <= newLen; count++)
        {
            if(count < arr1.length)
            {
                newArr[count] = arr1[count];
                
            }
            if(count == arr1.length)
            {
                arr1read = true;
            }

            if(newLen - count == arr2.length && arr1read == false)
            {
               newArr[count] = arr2[count];
            }
            
        }

        for(int count = 0; count < newLen; count++)
        {
            Sysetm.out.println(newArr[count]);
        }


       return newArr;
        
    }
}
