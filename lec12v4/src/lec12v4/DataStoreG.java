
package lec12v4;

public class DataStoreG<E>/*<E,T> the different type*//*<E,E> the same type*/ { 
             // E or any letter means i can have any dataType(Reference) ,, can store more than one variable <E,T>  
    
    private E data;
   // private T data2;
    
    public void setData(E data){
        this.data=data;
    }

    public E getData() {
        return data;
    }
    
}
