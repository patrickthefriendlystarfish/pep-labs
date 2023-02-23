import javax.lang.model.util.ElementScanner6;

public class CharComparison {
    /**
     * Given an array of char, determine if the array A belongs to the left or to the right of char array B lexigraphically.
     * That means its position in a dictionary, eg:
     * cat < dog < mouse
     * cat < car < care
     * You will need to compare an index of both arrays against each other as you iterate with a for loop.
     *
     * @param a an array of char.
     * @param b an array of char.
     * @return -1 if A is less than B, 1 if A is greater than B, and 0 if the two arrays are identical.
     */
    public int compare(char[] a, char[] b){
        char[] identicalLetters = new char[b.length];
      for(int count = 0; count < b.length; count++)
      {
        if(a[count] == b[count])
        {
            identicalLetters[count] = a[count];

            if(count == b.length - 1)
            {
                for(int i = 0; i < identicalLetters.length; i++)
                {
                    if(i == identicalLetters.length - 1)
                    {
                        return 1;
                    }
                }
            }

            
        }
        else if(a[count] < b[count])
        {
            if(count == 0)
            {
                return -1;
            }
            else
            {
                return -1;
            }
        }
        else if(a[count] > b[count])
        {
            if(count == 0)
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
        else
        {
          continue;  
        }
  
      }

      





      
       return 0;
    }
}
