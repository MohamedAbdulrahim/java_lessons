
package lec10v1;

public class Lec10v1 {

    public static void main(String[] args) {
        
        // Interface : away to implement classes from Interface
            // to don't make more modifing in code if i replace class 
            // Circle1 class implementation, Circle2 class implementation
            // >> have the same methods & variables in Interface or abstract class
            
            // abstract class be super class to sub classes must do the methods in abstract class
            // OR Interface and Classes implement it
            
            // class can't extend(inherit) from more one class but class can implement more than one 
                    //  so interface better than abstract class
                    
            Circle c = new Circle();
            c.x=5;
            c.y=7;
            System.out.println("Circle Area = "+c.area());
            
// if i make another circle class has more difference but implement from Interface CircleADT 
// we doesn't need to change methods it methods in Interface or abstract class

 // means we need standard class
 // better when make object let Interface reference hold it.
 // Interface implement polymorphism concept(Override)
            
        
    }
    
}
