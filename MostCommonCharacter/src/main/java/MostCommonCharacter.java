import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {

        Map<Character, Integer> map = new HashMap<>();
        
        int counter = 0;
        
        for(int count = 0; count < str.length(); count++)
        {
            if(map.containsKey(str.charAt(count)))
            {
                map.put(str.charAt(count), map.get(str.charAt(count)) + 1);
            }
            else
            {
                map.put(str.charAt(count), counter);
            }
        }

        for(int count = 0; count < map.size(); count++)
        {
            
        }

       
        
    }
}
