package lec15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Lec15v2FOS { 
                        

    public static void main(String[] args) {
        
        // Serialization >> take block of data of File ,, bytes ,, saved by Object
        
        // to write object with Serialization technique must implement serializable interface
        Employee e1 = new Employee();
        e1.setEmpno(1);
        e1.setName("ali");
        e1.setPassword("152");
        
        // Serialization
        // File , FileOutputStream , ObjectOutputStream >> Write
        // File , FileInputStream , ObjectInputStream >> Read
        
        File myFile = new File("E:\\jojo.txt");
        File myFile2 = new File("E:\\joj.abc"); // to make extension
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(myFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(e1);
            oos.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("File not found"+ex.getMessage());
        } catch (IOException ex) {
            System.out.println("error ObjectOutputStream");
        }
        
        // String implement serializable interface
       
    }
    
}
