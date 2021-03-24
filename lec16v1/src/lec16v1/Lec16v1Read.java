
package lec16v1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lec16v1Read {

    public static void main(String[] args) {
        
        // Stream
        
        // InputStream (abstract class)
        // OutputStream (abstract class)
        
        
        // Read
        File myFile = new File("E:\\jojo.txt");
        InputStream inputS;
        try {
            long fileLen = myFile.length(); // Long > 2^64
            byte[] arr = new  byte[500]; // if Integer.Max >> can make problems in runTime
            
            inputS = new FileInputStream(myFile);
            //OR
         int d = inputS.read(); // read byte byte ,, if end return -1
            System.out.println(d);
        } catch (FileNotFoundException ex) {
            System.out.println("file not found"+ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Lec16v1Read.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
