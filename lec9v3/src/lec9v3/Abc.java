package lec9v3;

public class Abc {


public static Shape createShape(){
    
    Shape r ;
    if(Math.random()>0.6){ // create random number from 0 to 0.9
        r = new Circle(); 
    }
    else{
        r = new Square();
    }
    return r;
}    
}
