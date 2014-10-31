/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueassignment;

import java.util.ArrayList;
import java.util.Arrays;
import static queueassignment.MainQuiz.inc;

/**
 *
 * @author Athinodwros
 */
public class BreakListDown {

    public static String[][] list = new String[5][8];
    public static int love=0;

    public static void create2DArray(ArrayList<String> loaded) {
        for (String loaded1 : loaded) {
            String got[]=loaded1.split(",");
            list[love][0]=got[0];
            list[love][1]=got[1];
            list[love][2]=got[2];
            list[love][3]=got[3];
            list[love][4]=got[4];
            list[love][5]=got[5];
            list[love][6]=got[6];
            list[love][7]=got[7];
            love++;
        }
//        String ch[];
//        ch = new String[loaded.size()];
//        for (int i = 0; i < loaded.size(); i++) {
//            String hi = loaded.get(i);
//            ch = hi.split(",");
//            System.out.println(Arrays.toString(ch));
//            System.out.println(ch[0]);
//            list[i][0] = ch[0]; //question
//            list[i][1] = ch[1]; //anser1
//            list[i][2] = ch[2]; //anser2
//            list[i][3] = ch[3]; //anser3
//            list[i][4] = ch[4]; //anser4
//            list[i][5] = ch[5]; //Correct Answer
//            list[i][6] = ch[6]; //File path if there is any else the string null
////            list[i][7]=ch[7]; //Type of question (text,image,video)
//            i++;
//        }
        

    }
}
