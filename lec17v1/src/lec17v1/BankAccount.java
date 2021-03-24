
package lec17v1;

class BankAccount {
    
    private double balance;
    public boolean isBalanceProcessed = false;
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
}
