
package lec7v2;

public class Abc {
    
 public void doSomething(Circle c){ // in this method > passing by value can modify in Object
     
     if(c!=null){ // if condition for prevent null pointer exception
         System.out.println("x = "+c.x+"\ty = "+c.y+"\tradius = "+c.getRadius());
     
     c.x=5;
     c.y=6;
     c.setRadius(4);
     
     System.out.println("x = "+c.x+"\ty = "+c.y+"\tradius = "+c.getRadius());
     }
 }   
 
  public void doSomething(double x, double y , double radius){ //in this method > passing by value can't modify in values of Object , Read Only
      
     System.out.println("x = "+x+"\ty = "+y+"\tradius = "+radius);

 } 
 
  public void fillCircle(Circle c){ 
     
     c.x=8;
     c.y=11;
     c.setRadius(13);   
    
 }
  
  public Circle createCircle(){
      Circle c = new Circle();
      c.x=10;
      c.y=10;
      c.setRadius(10);
      
      return c;
  }
  
  
}
