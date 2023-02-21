
public class StringReverse {
    /**
     * Task: return the reverse of a string.
     * There are multiple good ways to solve this problem.
     *
     * You could do some math to grab characters from the end of the String using a typical for loop.
     * For instance, you could use build a String by writing a for loop that decrements rather than increments, grabbing
     * characters from the String starting from the end.
     * You could also look into the methods provided by StringBuilder.
     *
     * @param str a String.
     * @return the reverse of str.
     */
    public String reverse(String str){
        System.out.println("Original String: " + str);
       StringBuilder strbuilder = new StringBuilder();
       String returnedString = "";

       for(int count = str.length() - 1; count >= 0; --count)
       {
            strbuilder.append(str.charAt(count));
       }

        returnedString = strbuilder.toString();
        System.out.println("ReturnedString: " + returnedString);

        return returnedString;
        
    }
}
