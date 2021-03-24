
package lec16v3;

public class Lec16v3 {

    public static void main(String[] args) {
        TaskA t1 = new TaskA();
        
        Thread w1 = new Thread(t1); 
        w1.setName("Worker_1");
        
        Thread w2 = new Thread(t1);
        w2.setName("Worker_2");
        
        w1.start(); 
        w2.start();                                                               
        

    
        // if i need to make same task at the time like make more copy or download >> synchronization
            // one Task more Threads (shared task)
         
    }
    
}
