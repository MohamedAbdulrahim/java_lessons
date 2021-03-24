
package lec8v3;

public class Circle {
      
    private double radius;
    public Point center = new Point();// Aggregation >> Has A 
    

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius>=0)
        this.radius = radius;
        else
            throw new RuntimeException("radius can't be negative");
    }
}
