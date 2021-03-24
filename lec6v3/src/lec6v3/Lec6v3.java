
package lec6v3;

import javax.swing.JOptionPane;

public class Lec6v3 {
    
    public static void main(String[] args) {
     
        Circle c1 = new Circle(); // c1 is a reference has hashcode(address in memory)
        c1.x=1;
        c1.y=3;
        c1.setRadius(9);
        
        System.out.println("hashcode c1 = "+c1); // print >> typeOfObject@hexadecimalNumber
        
        Circle c2=c1; // means c2,c1 refer to the same object 
        System.out.println("c1.x = "+c1.x);
        System.out.println("c2.x = "+c2.x);
        
        
        Circle c3 = new Circle(); 
        c3.x=1;
        c3.y=3;
        c3.setRadius(9);
        
        
        if(c1.equals(c3))
            System.out.println("c1 equals c3");
        else
            System.out.println(".equals method not Modified(Override)"); // Override means Modification
        
        String s = "Omar";
        System.out.println("s = "+s); // String class print data
                                       // String class execute toString method(inherted from Object class) by Override
                
        Circle c4=null; // means reference doesn't refer to object
                        // if we don't need Object don't refer to it (null),, to don't make reference refer to Object
                                                                     // to clean Memory by Garbage Collection (GC)
        // Now c4 doesn't refer to any Object
      //  c4.x=2; // error >> NullPointerException
        
        String st = JOptionPane.showInputDialog("please enter a word");
   
        if(st!=null)
            System.out.println("Length = "+st.length());
        else
            System.out.println("Length = null");
    }
    
}
