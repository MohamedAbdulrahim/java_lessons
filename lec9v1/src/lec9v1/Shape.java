
package lec9v1;

public class Shape { // Super class
    
    public int color;
    private int num;
    private int pattern;// when extends have the same access modifier in sub classes
    // sub class can't change access modifier in super class
    // private can't access it only in the same class
    public void sayHello(){ 
        System.out.println("Hello, I'm a Shape");
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) { // validation 0 To 255
        if(num>=0 && num<=255)
            this.num=num;
        else
            throw new RuntimeException("Invalid shape num");
            
    }
    
}
