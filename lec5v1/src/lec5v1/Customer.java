
package lec5v1;

            //  non Runnable class
public class Customer {
   public String name; // instance variable
    
   private int id; // private used for validation ,, user can't access id directly
    
    static int tax; // static variable
    
    int getRate(){ // method
        
        return 2;
    }
    
        void updateDB(){ // method      
    }
        // Setter used for Validation
        public void setId(int i){
            // validate
            
        }
        
        // getter to return data 
        public int getId(){
            return id;
        }
        
    
        //  class is a file
        
    
    // Object have characteristics & behavior
    
    // Any thing is Object >> pen , car , mobile , human , animal , and so on...
    
    /*
    example:
    pen
    characteristics : brand , size , color
    behavior : Writing
    
    
    OOP >>
    Encapsulation
    Inheritance
    Polymorphism
    Abstaction
    
    
    characteristics = fields , attributes
    behavior = methods
    
    */
    
    // Validation >> private fields >> Setter methods
    
    
}
