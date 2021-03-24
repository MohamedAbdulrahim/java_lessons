package lec16v2;

public class TaskA implements Runnable{ // implements Runnable for multiThreading

    @Override
    public void run() {
        
        // can more threads work in one method
        Thread t = Thread.currentThread(); // to know which thread is working
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread "+t.getName() +" is running in itearation: "+i);
            
            try {
                Thread.sleep(1);// milliSecond  , 1000 = 1 second
                Thread.yield(); // let thread from running to runnable(queue) for another thread >> has the same priority
                                   // OS can ignore this statement
                //  used to stop running thread for time
            } catch (InterruptedException ex) {
                
            }
        }
    }
    
}
