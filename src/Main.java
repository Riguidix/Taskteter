// Java Classes
import Actions.helpers;
import java.util.Scanner;

// Personal Classes
// import Actions.commands;

/**
 * @matricula 18550937
 * @version 1.0.0
 * @author Reydescel Herrera
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] data;
        
        // Actually never use it, seems like always an endless loop
        // boolean exitFlag = true;
        int idValue;
        String userValue, validator;        
        
        
        System.out.println("Welcome to Tasketer");
        // Handles to always keep track of the user commands
        do {            
            System.out.print("> ");
            // The user type a command
            userValue = input.nextLine();
            
            helpers.findingStrings(userValue);
        // The same condition } while (exitFlag);    
        } while (true);
    }    
}
