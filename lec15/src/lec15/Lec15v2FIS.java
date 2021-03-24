
package lec15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Lec15v2FIS {
    
    public static void main(String[] args) {
        
        Employee e1 = null;

         
        File myFile = new File("E:\\jojo.txt");
        FileInputStream fis;
        
        try {
            fis = new FileInputStream(myFile);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee emp = (Employee)ois.readObject();
            System.out.println(emp.getEmpno());
            System.out.println(emp.getName());
            System.out.println(emp.getPassword()); // given null because transient
            // save e1.getPassword(); 
            ois.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("File not found "+ex.getMessage());
        } catch (IOException ex) {
            System.out.println("error ObjectInputStream");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Lec15v2FIS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
   
}
