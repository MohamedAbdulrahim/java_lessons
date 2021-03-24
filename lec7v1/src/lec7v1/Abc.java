
package lec7v1;

public class Abc {
    
 public void doSomething(Circle c){ // passing by value can modify in Object
     
     if(c!=null){ // if condition for prevent null pointer exception
     System.out.println("x = "+c.x+"\ty = "+c.y+"\tradius = "+c.radius);
     
     c.x=5;
     c.y=6;
     c.radius=4;
     
     System.out.println("x = "+c.x+"\ty = "+c.y+"\tradius = "+c.radius);
     }
 }   
 
  public void doSomething(double x, double y , double radius){ // passing by value can't modify in values of Object , Read Only
      
     System.out.println("x = "+x+"\ty = "+y+"\tradius = "+radius);

 } 
 
  public void fillCircle(Circle c){ 
     
     c.x=8;
     c.y=11;
     c.radius=15;    
    
 }
  
  public Circle createCircle(){
      Circle c = new Circle();
      c.x=10;
      c.y=10;
      c.radius=10;
      
      return c;
  }
  
  
}
