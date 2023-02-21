
import java.util.LinkedList;
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        List<Integer> sums = new LinkedList<>();
        //for sorting the list
        int temp = 0;
        
        for(int i = 0; i < nums.size(); i++)
        {
            if(i != 0)
            {
                for(int count = i; count > 0; count--)
                {
                    int currentNum = nums.get(count);
                    int pastNum = nums.get(count - 1);
                    sums.add((currentNum + pastNum));
                }
            }

            for(int count = i; count < nums.size(); count++)
            {
                int currentNum = nums.get(count);
                int nextNum = nums.get(count + 1);
                sums.add((currentNum + nextNum));
            }
        }

        //sorting the List
        for(int i = sums.size() - 1; i > 0; i--)
        {
            for(int j = 0; j < i; j++)
            {
                if(sums.get(j) > sums.get(j+1))
                {
                    temp = sums.get(j);
                    sums.set(j, sums.get(j+1));
                    sums.set(j + 1, temp);
                }
            }
        }

        return sums.get(sums.size() - 1);
    }
}