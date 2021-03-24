 // When make it Inheritance or Accosiation ?
package lec9v1;

public class Lec9v1 {

    public static void main(String[] args) {
        // Inheritance
//         {any class inherited from object class}: default Inheritance
// parent (Suber class) , 
    // relation "is A" means Manager is a employee & programmer is a employee
    /*Notes
   
    constructors doesn't inherited , private doesn't inherited
    package doesn't inherited if subclass in package & superclass in another package
     */
    /*
   // paradigm : way of writing code
    multiInheritance : direct inherit from more class , java doesn't support multiInheritance
    java has only single inheritance
    Inheritance chain >     Manager inherit > Employee inherit > person
    // Object class (parent) > parent of > Arrays , Math , String , System .... (child)
     */    
    
    // multiple Inheritance not allowed in java
    
    /*
    if you need to inherit >> the same access modifier or higher
    
    public
    protected
    package
    private
    
    */
    
    Circle c1= new Circle();
    c1.color = 7;  
    
    
    // Override
    c1.sayHello();
    ////////////////////////////
    
    Shape s = new Shape();
    s.sayHello();
    
    
    /////////////////
    c1.setNum(9);
        System.out.println("Num "+c1.getNum());
    c1.setNum(99);
    
   
    }
    
}