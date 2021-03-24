
package lec7v2;

public class Lec7v2 {

    public static void main(String[] args) {
    
        Circle c1 = new Circle(); // () means calling method (default constructor)
        Circle c2 = new Circle(10,20,30);
        System.out.println("c2.x "+c2.x);
        System.out.println("c2.y "+c2.y);
        System.out.println("c2.getRadius "+c2.getRadius());
        
//        Circle c3 = new Circle(2,3); // private constructor
        Circle.createCircle();
        
        Abc a1 = new Abc(); // () means calling method (default constructor)
        
        a1.doSomething(c2);
        // OR
        a1.doSomething(new Circle(10,20,30));
        
//    abstract : if making class and you don't need anybody making object , make it ABSTRACT

    }
    
}
