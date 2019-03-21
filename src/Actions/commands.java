/*
    Handles the commands as the ADD, LIST, EDIT, DONE
*/

package Actions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @matricula 18550937
 * @version 1.0.0
 * @author Reydescel Herrera
 */
public class commands {
    
    /**
     * Make new tasks
     */
    public static void add() {
        
    }
    
    /**
     * Take a list of all the Tasks incompletes
     */
    public static void list() {
        
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
}

