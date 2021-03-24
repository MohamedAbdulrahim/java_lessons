
package lec9v1;

public class Circle extends Shape{ // sub class

    public double x,y;  
    private double radius;
//    public int color;
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius>=0)
        this.radius = radius;
        else
            throw new RuntimeException("radius can't be negative");
    }
    
    // Override in Inheritance :: extends method and Modify it
    @Override
    public void sayHello() { //
        System.out.println("Hello, I'm a Circle");
    }
    // Java is case sensetive

   
    public void setNum(int num) { // validation 0 To 9
        if(num>=0 && num<=9){
           // this.num=num; given error
              super.setNum(num); // super to call super class
              // Recursion : means the method called itself
        }
        else
            throw new RuntimeException("Invalid shape num");
            
    }

}