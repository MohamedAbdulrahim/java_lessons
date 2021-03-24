package lec8v1;

public class Lec8v1 {

    public static void main(String[] args) {
        // main must be static >why> run class in jvm , if i open object from main i need to open it 
        // constructor can't be static
         // static concept > keyword
         // static variable     static method
         // famous static method is main
         
         
/*
    Instance/Object >> owned by object so must creating object , change from one to another
    static/class >> (shared field) all objects see it ,, owned by class >> one value ,, don't need to create object ,, when class load in memory
    Initialization (Instance) >> Implicit(default) , Explicit (3 Ways) >> Declaration , Constructor , Initializer
    Initialization (static) >> Implicit(default) , Explicit (2 Ways) >> Declaration , static Initializer
     */ 

     Circle c1 = new Circle();
     Circle c2 = new Circle();
     
     
     // static variable have the same value for all Objects
     c1.v2=10; // static variable can access by Object
        System.out.println("c2.v2= "+c2.v2);//cTwo
        Circle.v2=15;
        System.out.println("c1.v2 = "+Circle.v2+"c2.v2 = "+Circle.v2);
     
        
        Circle.m2(); // calling static method
        c2.m2(); // calling static method - not prefered
        
        c2.m1(5); // calling instance method
        
        Circle c3 =new Circle();
        
        System.out.println("id c1 "+c1.getId());
        System.out.println("id c2 "+c2.getId());
        System.out.println("id c3 "+c3.getId());
        
    }
    
}
