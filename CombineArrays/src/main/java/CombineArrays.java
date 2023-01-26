
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
        int arr2count = 0;

        for(int count = 0; count < arr1.length; count++)
        {
            newArr[count] = arr1[count];
        }
        for(int count = arr1.length; count <= newLen && arr2count < 3; count++)
        {
            newArr[count] = arr2[arr2count];
            arr2count++;
        }

        


       return newArr;
        
    }
}
