
package lec6v3;

public class Circle {
    double x; //  default access modifier >> see in package
    double y;
    private double radius; // radius is global variable
    
    public void setRadius(double radius){ // << radius is local variable
        if(radius>0) // Validation
             this.radius=radius; // this : refer to Object not local variable
        else{
           // System.out.println("Invalid radius");// work but program still running so making exception
           // every error has exception,, every exception(is class) has object so open it by new 
           throw new RuntimeException("Invalid radius"); // throw used for return reference for program how called 
        }
    }
    public double getRadius(){
        return radius;
    }
    
    // alt + insert >> setter,Getter in NetBeans
    
    public double area(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return Math.PI*Math.pow(radius, 2);
    }
    
    public void printDetails(){
        System.out.println("Radius = "+radius+"\nArea = "+area()+"\nCircumference = "+circumference());
    }

    @Override
    public boolean equals(Object o) {
      
        Circle c = (Circle)o;
        
        return this.x==c.x&&this.y==c.y&&this.getRadius()==c.getRadius(); 
    }

    
    
    
}
