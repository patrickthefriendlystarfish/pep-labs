
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
        //for sorting the list
        
        for(int i = 0; i < nums.size(); i++)
        {
            if(i > 0)
            {
                for(int j = i; i > 0; j--)
                {
                    int currentNum = nums.get(j);
                    int previousNum = nums.get(j - 1);
                    System.out.println("i > 0, in nested for");
                    int sum = currentNum + previousNum;
                    System.out.println("Sum of current number plus previousNumber :" + sum);
                    sums.add(sum);
                }
            }

            for(int k = i; k < nums.size(); k++)
            {
                int currentNum = nums.get(k);
                int nextNum = nums.get(k + 1);
                System.out.println("In other nested for loop");
                int sum = currentNum + nextNum;
                System.out.println("Sum of currentNumber plus nextNum: " + sum);
                sums.add(sum);
            }
        }
       
        for(int i = 0; i < sums.size() - 1; i++)
        {
            for(int j = 0; j < sums.size() - i - 1; j++)
            {
                if(sums.get(j) > sums.get(j + 1))
                {
                    int temp = sums.get(j);
                    sums.set(j, j + 1);
                    sums.set(j + 1, temp);

                }
            }
        }
      
       return sums.get(sums.size() - 1);
    }
}