
package lec17v1;


public class Lec17v1 {

    public static void main(String[] args) {
      
        
        BankAccount b = new BankAccount();
        TaskA t1 = new TaskA();
        t1.bAcc=b;
        Thread w1 = new Thread(t1);
        w1.start();
        
        // Wait notify : i wait(not Working) untill someone wakeup me (to Work) 
        // who wakeup me any thread work on the same object
        
        
        synchronized (b){
            try{
            while(b.isBalanceProcessed==false){ // pre request not satisfied
             b.wait(); // it's like i remove synchronized for current thread
            }
            
            System.out.println(b.getBalance());
            
            }catch(InterruptedException ex){
                System.out.println("Error");
            }
        }
    }
    
    
    
}
