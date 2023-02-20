
public class ArrayAbsoluteValue {
    /**
     * Given an array of integers 'nums', produce an array of integers composed of the absolute values of all the
     * numbers in 'nums'. Absolute value represents the distance from zero, so negative numbers should become positive
     * and positive numbers should stay the same.
     *
     * @param nums an array.
     * @return the absolute value array of nums.
     */
    public int[] getArrayAbs(int[] nums){
        int abs[] = new int[nums.length];

        for(int count = 0; count < nums.length; count++)
        {
            if(nums[count] < 0)
            {
                abs[count] = nums[count] * -1;
            }
            else
            {
                abs[count] = nums[count];
            }
        }

        return abs;
    }
}