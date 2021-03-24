
package lec16v3;

public class TaskA implements Runnable{ 

    public int x=10;
    @Override
    public void run() { // i can add synchronized in override ,, but now i remove threding
        
       
        Thread t = Thread.currentThread(); 
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread "+t.getName() +" is running in itearation: "+i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
              
            }
            checkAndDoc();
            //OR

            System.out.println("x = "+x);
        }
    }
    
public synchronized void checkAndDoc(){// if any thread in synchronized making block , thread asking java for Lock on Object
       //  if the same synchronized method or another synchronized mehtod ,, Lock any another thread >> Lock of Object
        if(x>0){
            //#11
            x--;
        }
        // if 2 threads start ,x like static for 2 threads ,, x can be -1 in #11 >> very critical ,, after check(if) take control from him 
        // so how to stop this wrong , making synchronization
        // synchronized mean if thread inside the method make all code before another thread >> is called block
        
        // block : if any thread in block ,, any another thread can't enter in there ,, block any another thread
            // means no thread can enter to block until the thread who making block is finish the method
            
        // Lock :any object in java can make it Lock ,, only one time making lock for it
    }
}
    
