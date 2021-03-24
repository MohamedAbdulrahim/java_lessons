
package lec15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class lec15v1Reader {
    public static void main(String[] args) {
           // Read
     
     File myFile = new File("E:\\jojo.txt");  

     FileReader fr;
     BufferedReader br;
        try {
            fr = new FileReader(myFile);
            br = new BufferedReader(fr);
            
           // String line = br.readLine(); // bring row
            /*
            while(line!=null){
                System.out.println(line);
                line = br.readLine();
            }
            */
            //OR
            String lin = null;
            while((lin=br.readLine())!=null){
                System.out.println(lin);
            }
            br.close();
            
            
        } catch (IOException ex) {
            System.out.println("IO errors "+ex.getMessage());
        }
    }
  
}
