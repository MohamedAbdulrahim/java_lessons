
package lec7v1;

public class Lec7v1 {

    public static void main(String[] args) {
        // passing object for method
        // passing data by Reference()
        
        Circle c1 = new Circle();
        c1.x=1;
        c1.y=1;
        c1.radius=1;
        
        Abc a1 = new Abc();
        a1.fillCircle(c1); // if i need make method fill circle value
        a1.doSomething(c1);// passing by reference
        a1.doSomething(0, 0, 0); // passing by value
        
        Circle c2;
        c2=null;
        a1.fillCircle(c2); // Null pointer exception
             
        Abc ci = new Abc();
        Circle c = ci.createCircle();
        if(c!=null)
          System.out.println("c.x = "+c.x);
        
    }
    
}
