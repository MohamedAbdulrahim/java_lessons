
package lec9v2;

public class Shape { 
    
    public int color;
    
    public Shape(int color){
        
        this.color=(color);
    }
     // make default constructor to don't gi3ven error in sub classes , if you make object from sub class
    // memory call constructor super class then sub class
    public Shape() {
        System.out.println("Shape constructor");
    }
    

    public void sayHello(){ 
        System.out.println("Hello, I'm a Shape");
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) { 
        if(color>=0 && color<=255)
            this.color=color;
        else
            throw new RuntimeException("Invalid shape num");
            
    }
    
}
