
package lec17v2;

public class Lec17v2 {

    public static void main(String[] args) {
        
        
        // Inner class 
            // >> nested class
            // Inner class has types
                // member class
                // Local method Inner class
                // Anonomous class
            /* Nobody open Object from Inner class 
        Circle c1 = new Circle();
        Circle.Point p1 = c1.new Point(); // create Object from Point
        
        p1.x = 4;
            */
            
        MyButton b = new MyButton();
       // MySaveAction code = new MySaveAction();
        b.setRef(new  ActionInterface() {
            @Override
            public void save() {
                    System.out.println("Data saved 2");
            }
        }); // Annoumous class  
        b.click();
            
            
    }
    
}
