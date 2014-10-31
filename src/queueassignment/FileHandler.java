package queueassignment;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author favl
 */
public class FileHandler {
    
    /*
    Make load and save methods for contestants.
    */
    
    ArrayList<Contestant> list = new ArrayList(); //Creating an ArrayList containing names and ticket numbers for contestants.
    public static ArrayList<String> listStr = new ArrayList(); //Creating an ArrayList containing names and ticket numbers for contestants.
    
    public ArrayList<Contestant> readFile(){        
        //We'll make a scanner to the text file. We set the scanner to read from file source.
        Scanner scan = null;
        try {
        scan = new Scanner(new File("contestants.txt"));  
        } catch (Exception e) {
            e.printStackTrace();
        }
        while(scan.hasNext()){
            String str = scan.nextLine();
            //System.out.println(str);
            //just checking if it reads the file.
            String[] tokens = str.split(",");
            //System.out.println(tokens[0]);
            //Parsing the data to int's. Then adding them to the ArrayList created in the beginning.
            String firstName = tokens[0].trim();
            String lastName = tokens[1].trim();
            int ticketNumber = Integer.parseInt(tokens[2].trim());
            
            Contestant c = new Contestant(firstName, lastName, ticketNumber);
            //Now add the data to the ArrayList we created in the beginning.
            list.add(c);
        }
        
        return list;
    }
    public ArrayList<String> readQuestions(){        
        //We'll make a scanner to the text file. We set the scanner to read from file source.
        Scanner scan = null;
        try {
        scan = new Scanner(new File("Questions.txt"));  
        } catch (Exception e) {
            e.printStackTrace();
        }
        while(scan.hasNext()){
            String str = scan.nextLine();
            listStr.add(str);
            
            
        }
        
        return listStr;
    }
    
}
