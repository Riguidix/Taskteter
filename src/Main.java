// Java Classes
import java.util.Scanner;

// Personal Classes
// import Actions.commands;
import Actions.helpers;
/**
 * @matricula 18550937
 * @version 1.0.0
 * @author Reydescel Herrera
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Actually never use it, seems like always an endless loop
        boolean exitFlag = true;
        int idValue;
        String userValue, validator;        
        
        
        System.out.println("Welcome to Tasketer");
        // Handles to always keep track of the user commands
        do {            
            System.out.print("> ");
            // The user type a command
            userValue = input.nextLine();
            
            if(helpers.findingStrings(userValue, "task")) {
                System.out.println("");
            }
            
        } while (exitFlag);
    }    
    
    /**
     * Handles the space as the Terminal do with an update of if you need 3 
     * spaces you type in "blankspace( x )" as x the value of spaces to print
     * pretty cool in situations of just one space or 10 with don't make other method
     * 
     * @param j The "how many spaces"
     */
    public static void blankspace(int j) {
        for (int i = 0; i < j; i++) {
            System.out.println(" ");
        }
    }
    
    /**
     * Display the information of the commands without no details
     */
    public static void helpCommand() {
        System.out.println("Tasketer Guide:");
        System.out.println("task ");
        System.out.print("[-add] ");
        System.out.print("[-list]");
        System.out.print("[-edit]");
        System.out.print("[-done]");
        // Spacing
        blankspace(2);
    }
    
    /**
     * Display the information of the commands with extremely details
     */
    public static void manHelpDescription() {
        helpCommand();
        System.out.println("Tasketer Guide: Please don't use '-' in the description of the task, it's just in commands sections");
        System.out.print("add      ");
        System.out.println("Add a new task");
        System.out.print("list     ");
        System.out.println("Make a list of the pending tasks");
        System.out.print("edit     ");
        System.out.println("Launch a line to modify a task");
        System.out.print("done     ");
        System.out.println("Complete a task, delete for complete from the list");
        blankspace(2);
    }
}
