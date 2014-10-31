/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubmitQuestions;

import static com.sun.org.apache.xml.internal.serialize.LineSeparator.Windows;
import javax.swing.JFileChooser;

/**
 *
 * @author Athinodwros
 */
public class FileOpenClass {
    public String userPicker(){//opens a filechooser for the user to pick a photo or a video 
        JFileChooser picker = new JFileChooser();
        int checkNumber = picker.showOpenDialog(null);
        if (checkNumber == JFileChooser.CANCEL_OPTION) {
        picker.setVisible(false);
        }
        String userSelectedfile = picker.getSelectedFile().getAbsolutePath();
        QuestionHandler.file=picker.getSelectedFile();
        return userSelectedfile;//returns the path of the file as a string in order to use it in the questions
        
    }
    
}
