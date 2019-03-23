/*
    Handles the Arrays modifications and other kind of things such as delete, adding, change, move
*/

package Actions;

/**
 * @matricula 18550937
 * @version 1.0.0
 * @author Reydescel Herrera
 */
public class helpers {        
    /**
     * Handles the space as the Terminal do with an update of if you need 3 
     * spaces you type in "blankspace( x )" as x the value of spaces to print
     * pretty cool in situations of just one space or 10 without make another method
     * 
     * @param j The "how many spaces"
     */
    public static void blankspace(int j) {
        for (int i = 0; i < j; i++) {
            System.out.println(" ");
        }
    }
    
    /**
     * Help us to count the arrays items to handle the increment size or even decreze it
     * @param item as the ...
     * @return item as the value of the length of the array
     */
    public static int taskCounter(int item) {
        
        return item;
    }
            
    /**
     * Help to find the string by cut on spaces.
     * @param user It's the actual String from the Scanner in Main
     * @return a number to actually no use it for the really cause
     */
    public static int findingStrings(String user) {
        int condition;
        // Splited as the "break" of the String in multiple tokens
        String[] splited;
        // The "\\s+" it's a whitespace regex this will cause any number of consecutive spaces to split your string into tokens.
        // If we don't use trim it will cost to use a whitespace in the array 0 pos
        splited = user.trim().split("\\s+");
        condition = findingCommands(user, splited);
        return condition;
    }
    
    /**
     * Help to find a command by it's keyword 
     * @param user It's the actual String from the Scanner in Main
     * @param arrayData Actual a storage of the descriptions
     * @return
     */
    public static int findingCommands(String user, String[] arrayData) {
        int condition = 0, id;
        if(arrayData[0].toLowerCase().equals("task")) {
            try {
                switch (arrayData[1].toLowerCase()) {
                    case "-add":
                        commands.add(arrayData, commands.data);                        
                        break;
                    case "-list":
                        commands.list(commands.data);                        
                        break;
                    case "-edit":
                        id = Integer.parseInt(arrayData[2]) - 1;
                        System.out.println(id);
                        commands.edit(commands.data, id);
                        break;               
                    case "-done":
                        id = Integer.parseInt(arrayData[2]) - 1;
                        commands.done(commands.data, id);
                        break;
                    case "-help":
                    case "-h":
                        // Get the 'Help' or 'h' by an switch-case fall like -h || -help
                        commands.manHelpDescription();
                        break;
                    case "-exit":
                        commands.exit();
                        break;
                    default:
                        System.out.printf("The '%s' command don't exists \n", arrayData[1]);
                        commands.helpCommand();
                        break;
                }
            } catch(ArrayIndexOutOfBoundsException e) {
                return -1;
            }
        } else {
            System.out.println("Did you mean TASK command?");
        }
        return condition;
    }
}
