
import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
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

        List<Integer> sums = new ArrayList<>();
       for(int i = 0; i < nums.size(); i++)
       {
          int currentNum = nums.get(i);

          for(int count = i + 1; count < nums.size(); count++)
          {
             int nextNum = nums.get(count);
             int sum = currentNum + nextNum;
             sums.add(sum);
          }

          for(int count = i - 1; count > 0; count--)
          {
            int prevNum = nums.get(count);
            int sum = currentNum + prevNum;
            sums.add(sum);
          }
       }

       for(int i = 0; i < sums.size(); i++)
       {
            for(int j = 1; j < (sums.size() - i); j++)
            {
                if(sums.get(j - 1) > sums.get(j))
                {
                    int temp = sums.get(j - 1);
                    sums.set(j - 1 , j);
                    sums.set(j, temp);
                }
            }
       }

       return sums.get(sums.size() - 1);
}
    
}