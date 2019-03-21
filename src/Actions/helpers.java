/*
    Handles the Arrays modifications and other kind of things such as delete, adding, change, move
*/

package Actions;

import java.util.Arrays;

/**
 * @matricula 18550937
 * @version 1.0.0
 * @author Reydescel Herrera
 */
public class helpers {

    /**
     * Help us to count the arrays items to handle the increment size or even decreze it
     * @param item as the ...
     * @return item as the value of the length of the array
     */
    public static int taskCounter(int item) {
        
        return item;
    }
    
    /**
     *
     * @param user
     * @param toFind
     * @return
     */
    public static boolean findingStrings(String user, String toFind) {
        boolean condition = false;
        
        // Splited as the "break" of the String in multiple tokens
        String[] splited;
        
        // The "\\s+" it's a whitespace regex this will cause any number of consecutive spaces to split your string into tokens.
        // If we don't use trim it will cost to use a whitespace in the array 0 pos
      
        
       // It means that the String have the toFind String on it and returns True
        if(user.contains(toFind)) {
           condition = true; 
           splited = user.trim().split("\\s+");
           System.out.println(Arrays.toString(splited));
        }
        
        
      
        return condition;
    }
}
