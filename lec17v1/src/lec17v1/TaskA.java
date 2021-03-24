
package lec17v1;

public class TaskA implements Runnable{ 

    public BankAccount bAcc = null;
    @Override
    public void run() { // i can add synchronized in override ,, but now i remove threding
        
        updateAccount();
        
    }

    private  void updateAccount(){
        // Object has only one Lock
        // Critical means access something shared
        
        synchronized(bAcc) { // Lock on this Object ,, or this > current Object
            bAcc.setBalance(200);
            bAcc.isBalanceProcessed = true;
            bAcc.notifyAll();
            // notifyAll : all whose hold the Objects wakeup all  >> in synchronized 
            // notify : wakeup someone  >> in synchronized
        }
    }

}

    
