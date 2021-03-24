
package lec16v2;

public class Lec16v2 {

    public static void main(String[] args) {
        
        // Multithreading 
        // who is making task is called thread
        
        // main is task >> so main is thread
        // any program in java at least have one thread (single thread)
        
        // if there are codeA & codeB ,, sometimes codeA need things from codeB to work,
        //, so i make multithreading to codeB also working
        
        // multiProcessor >> search
        
        // main can be thread or calling threads
        
        TaskA t1 = new TaskA();
        Thread w1 = new Thread(t1); // to make threading ,, give the task
        w1.setName("Worker_1");
        w1.setPriority(Thread.MAX_PRIORITY);// 1 to 10     w1.setPriority(1); w1.setPriority(10);
        w1.setPriority(Thread.MIN_PRIORITY);
        w1.setPriority(Thread.currentThread().getPriority()); // priority of main ,, w1_Priority = main_Priority
        
        
        w1.start(); // to execute run in taskA
                                                       
        // in this moment there are 2 threads ,, means parallel
        
         for (int i = 0; i < 100; i++) {
            System.out.println("Thread main is running in itearation: "+i);
        }
         
         // New , Runnable , Running, (Sleeping,Waiting,Blocking) , Dead
         
         // New : when i create object from thread & give it the task but not start
         // Dead : when thread end the all task(run)
         // Runnable : OS has queue  >> when i told the thread start take the queue >> in the queue
         // Running : thread is working
         
         // Sleeping : used to stop running thread for time
         
         
         // Synchronization
         // Waiting  
         // Blocking  
         
         
         
         
         
         
         
    }
    
}
