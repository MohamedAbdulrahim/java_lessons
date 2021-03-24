
package lec9v3;

public class Circle extends Shape{

    public double x,y;  
    private double radius;

    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius>=0)
        this.radius = radius;
        else
            throw new RuntimeException("radius can't be negative");
    }
    
    @Override
    public double area(){
        return 3.14*radius;
    }
 
        

}