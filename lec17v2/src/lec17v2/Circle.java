
package lec17v2;

public class Circle { // Outer class >> public , default(package)
    
    private double rad;
    
    public Point center = new Point(); // create Object From Point
    
    
    
    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }
    
    public void m1(){
        int var = 40;
        class point{ // Local method Inner class >> always default(package)
                    // only this method can open this class
            public void doSomething(){
                System.out.println(var);
            }
                    
        }
    }
    
    
    private class Point{ // Inner class > public , private , protected , default(package) .. more be private
                        // Inner class can only called by access Outer class ,, Inner more used for certain Class
        public double x,y;
        //rad=0.3; // given error
        public void doSomething(){
            
            rad=0.5;
        }
       
        
        
    }
}
