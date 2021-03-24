
package lec15;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Lec15v1Write {

    public static void main(String[] args) {
     // File IO  
     
     // File  , FileWriter , printWriter    >> Write in file
     // File  , FileReader , BufferedReader >> Read in file
     
     // Write
     
     File myFile = new File("E:\\jojo.txt"); // just refer to file in memory ,, \\ or \  
     //File myFile = new File("jojo.txt"); // relative to working path 
     File f2 = new File("E:\\dir");
     f2.mkdir(); // to make file
     System.out.println(myFile.exists()); // if not exist java create file
     FileWriter fw;
     PrintWriter pw;
     PrintWriter pw2;
        try {
            fw = new FileWriter(myFile);
            // there is wrapping (Encapsulation) >> open Object pass it to another Object pass it to another Object
            pw = new PrintWriter(fw);
            //OR
            // pw2 = new PrintWriter(new FileWriter(new File(""))); // not more good ,, i can need make operation on File
            pw.println("this is the first Line"); // print in file ,, remove any thing and write 
            pw.println("this is the Second Line");
            pw.flush();// used to buffer (for sure save)
            pw.close(); //to close connection  ,, already making flush
        } catch (IOException ex) {
            System.out.println("IO errors "+ex.getMessage());
        }
     // there is wrapping (Encapsulation) >> open Object pass it to another Object pass it to another Object
     
    }
    
}
