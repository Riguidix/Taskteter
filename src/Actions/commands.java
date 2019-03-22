/*
    Handles the commands as the ADD, LIST, EDIT, DONE
*/

package Actions;

// Java Classes
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import java.util.ArrayList;

// Personal Classes
import static Actions.helpers.blankspace;

/**
 * @matricula 18550937
 * @version 1.0.0
 * @author Reydescel Herrera
 */
public class commands {
    // Set to 100 as an exagerated data
    public static List<String> data = new ArrayList<>();
    
    
    /**
     * Make new tasks
     * @param description
     * @param data
     * @return data
     */
    public static List<String> add(String[] description, List<String> data) {
        String taskDescription = "";
        for (int i = 2; i < description.length; i++) {
            taskDescription += description[i] + " ";
        }
        data.add(taskDescription);

        // taskDescription = Arrays.toString(Arrays.copyOfRange(description, 2, description.length));        
        return data;
    }
    
    /**
     * Take a list of all the Tasks incompletes
     * @param data
     */
    public static void list(List<String> data) {
        int ID;
        System.out.print("          ID         |          DESCRIPTION          \n");
        System.out.println("------------------------------------------------------");
        for(int i = 0; i < data.size(); i++) {
            ID = i + 1;
            if(data.get(i) != null) {
                if(ID == 100) {
                    System.out.printf("         %s         |             %s          \n", ID, data.get(i));   
                } else if(ID >= 10) {
                    System.out.printf("         %s          |             %s          \n", ID, data.get(i));   
                } else {
                    System.out.printf("          %s          |             %s          \n", ID, data.get(i));   
                }                
            }
        }
        blankspace(2);
    }
    
    /**
     * Edit the actual task by an ID
     */
    public static void edit() {
        
    }
    
    /**
     * Makes the status of the task to complete by an ID
     */
    public static void done() {
        
    }
    
    /**
     * Handles the exit of the program
     * just a simple System.exit(0)
     */
    public static void exit() {
        System.out.println("Closing Tasketer.");
        System.out.print("See you soon");
        for (int i = 0; i < 4; i++) {
            if(i == 3) { System.out.print(".\n"); } else { System.out.print("."); }
            try { Thread.sleep(500); } catch (InterruptedException ex) { 
                Logger.getLogger(commands.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("");
        System.exit(0);
        
    }
            
    /**
     * Display the information of the commands without no details
     */
    public static void helpCommand() {
        System.out.println("Tasketer Guide:");
        System.out.println("task ");
        System.out.print("[-add]");
        System.out.print("[-list]");
        System.out.print("[-edit]");
        System.out.print("[-done]");
        System.out.print("[-help]");
        System.out.print("[-exit]");
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
        System.out.print("exit      ");
        System.out.println("Set all to close the program");
        blankspace(2);
    }
}

