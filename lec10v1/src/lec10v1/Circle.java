
package lec10v1;

public class Circle implements CircleADT{

    public double x,y;
    private double radius;
    @Override
    public double area() {
        return 3.14*Math.pow(radius, 2);
    }

    @Override
    public void setRadius() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public double getRadius() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getTotalLength() {
        return 2*radius*Math.PI;
    }
    
}
