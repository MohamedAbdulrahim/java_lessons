
package lec16v1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lec16v1Write {
    
    public static void main(String[] args) {
        
            // Write
        File fileOut = new File("E:\\jojo.txt");
        OutputStream outputS ;
        
        try {
            outputS = new FileOutputStream(fileOut);
            long len = fileOut.length();
            byte[] arr = new byte[2000];
            outputS.write('a');
            outputS.close();
        } catch (FileNotFoundException ex) {
            System.out.println("file error"+ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Lec16v1Write.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
