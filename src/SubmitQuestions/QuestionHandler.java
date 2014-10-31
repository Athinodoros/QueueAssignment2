/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubmitQuestions;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Athinodwros
 */
public class QuestionHandler {

    public static int qs = 0; // a bublic integer to increment to use in order to pass the questions in the right place on the table.
    public static String q[][] = new String[5][8];
    public static File file;
    public static ArrayList<String> questions = new ArrayList<>();

    public static void toArrayList() {//pass all values from the 2D string array ti an array list to save to a file.
        for (int i = 0; i < 5; i++) {
            String a = (q[i][0] + "," + q[i][1] + "," + q[i][2] + "," + q[i][3] + "," + q[i][4] + "," + q[i][5] + "," + q[i][6] + "," + q[i][7]);
            questions.add(a);//adding each question along with anwers etc. to the arraylist.
        }
    }

    public static void saveToFile() throws Exception {
        if (questions == null) {
            return;
        }  //Checking parameter for null.
        FileWriter output;  //Creating reference for filewriter.

        try {
            output = new FileWriter(new File("just.txt"));  //Opening connection to file.
            for (String q : questions) {   //running through the ArrayList.                    
                output.write(q + "\n");  //Each String object is written as a line in file.
            }

            output.close();  //Closing the file
        } catch (Exception ex) {  //If something goes wrong everything is send to system out.
            System.out.println("Could not save to file!");
            System.out.println(ex.toString());
            ex.printStackTrace();

//    FileOutputStream fileStream = new FileOutputStream("Questions.txt");
//    ObjectOutputStream  newStream = new ObjectOutputStream(fileStream);
//    newStream.writeObject(questions);
//    
//    for (String newline : questions) {
//        FileWriter fileWriter = new FileWriter("Questions.txt") ;
//        try {
//        fileWriter.append(newline+"\n");
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "There is no such file.");
//        }
//      }
        }
    }
}
