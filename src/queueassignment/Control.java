package queueassignment;

/**
 *
 * @author favl
 */
public class Control {
    
        /*
        Load the questions and let the player answer them.
        */
    
    FileHandler fh = new FileHandler();
    
    public void play(){
        System.out.println(fh.readFile());
    }
    
}
