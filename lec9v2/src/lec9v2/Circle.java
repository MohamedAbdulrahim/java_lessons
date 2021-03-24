
package lec9v2;

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
    public void sayHello() { 
        System.out.println("Hello, I'm a Circle");
    }
  
    public void setNum(int color) { 
        if(color>=0 && color<=9){
              super.setColor(color);
     
        }
        else
            throw new RuntimeException("Invalid shape num");
            
    }
    // if i forgot to make default constructor in super class makeit>>
    public Circle(){
        // compiler ignore any code only >> super
        this(0,0,0);
        System.out.println("Circle constructor'2'");
    }
    
        public Circle(double x){
        // compiler ignore any code only >> super
        this(x,0,0);
        System.out.println("Circle constructor");
    }
        public Circle(double x,double y,double radius){
        // compiler ignore any code only >> super
        super();
        this.x=x;
        this.y=y;
        setRadius(radius);
        System.out.println("Circle constructor'1'");
    }
    
    // super() >> must be in constructor
        
       public Circle(double x,double y,double radius, int color){
   
        super(color);
        //OR
     //   super.color=color;// OR this.color=color; //
        this.x=x;
        this.y=y;
        setRadius(radius);
       
    }

}