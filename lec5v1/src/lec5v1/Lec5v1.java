
package lec5v1;

public class Lec5v1 {
                // Runnable class
    
    public static void main(String[] args) {
        
        // OOP Object Oriented Programming
        
        // CLASS IS THE DESIGN OF OBJECT
        // AN OBJECT IS AN INSTANCE OF A CLASS 
        /*
         How to make non Runnable Class?
            define Class Header
            define Data
            define Operations
            define Validations
            define Accessibility
          */
        
                
        // Variables >> 
        /*
        local / method / localMethod >> in method
        Instance / Object >> global
        static / class >> global
        
        // if i didn't write static >> means instance (Object)
        */
        
        
        // Classes see others if they are in the same (package)
        
        // if Classes in another (project) create classpath
        
        
        // To Open Object
            // new Operator to create object
            Customer c = new Customer(); // new Customer() >> return address of Object
            // Customer c >> c is a reference ,Customer is a dataType
            // java open in memory  size of Fields 
            //  reference have address of Object
            //  Reference datatype doesn't have limit (NO Limit)
            
            // open object to store data or make operation or .......
            
            // any class inherit from object class
          //  c.id = 1;//  id is instance variable in Customer
            c.name = "mohamed";
            Customer.tax=1; //  tax is static variable in Customer
            int r = c.getRate(); // Encapsulation : wrapping data without know how program do it , i just need input,output,method name
            System.out.println("r= "+r);
            
            Customer c2 = new Customer();
            
            c2.setId(4);
            System.out.println(c2.getId());
            
            
            
            
    }
    
    
}
