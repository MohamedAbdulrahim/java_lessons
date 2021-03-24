
package lec8v1;

public class Circle {
    
    private int id;
    private static int seq;
    
    public Circle() {
        seq++;
        id=seq;
    }
    
    // static initializer block
    static {
         // open only one time at loaded class in memory
        seq=0;
    }
    
    {
        // open every create Object
    }

    public int getId() {
        return id;
    }
    
    public double x,y;  
    private double radius;
    
    public int v1;// instance variable    nonStatic variable     Object variable
    public static int v2;// static variable      class variable
                                // static means shared for all Objects
                                
    

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius>=0)
        this.radius = radius;
        else
            throw new RuntimeException("radius can't be negative");
    }
    public void m1(int x){ // instance method --  can called non static & static variables, methods
        this.x=x; // CurrentObject.x= x of local;
    }
    
     // if method is static we can't calling non static variables & non static methods
    public static void m2(){ 
        // static method - we don't calling instance fields of Object directly >> given error
        // but we can create object to calling instance variables  
       // Circle.x=10; // given error
       
       Circle c = new Circle();
       c.x=10;
       
       Circle.v2=14;// v2 static variable
}
}