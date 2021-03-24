
package lec7v2;

public class Overloading {
    
    // Overloading sum

    public static int sum(int num1,int num2){
        return num1+num2;
    }
    public static long sum(long num1,long num2){ 
        return num1+num2;
    }
    public static long sum(short num1,short num2){       
        return num1+num2;
    }
    public static int sum(int num1,int num2,int num3){
        return num1+num2+num3;
    }  
    public static double sum(int num1,double num2){
        return num1+num2;
    }
    // double sum >> double is return type , sum is method name
    // parameter list >> (int num1,double num2)
    //  signature >> method name + parameter list 
    /*
    public static double sum(int num1,int num2){// error 
        return num1+num2;
    }
    */
    public static void main(String[] args) {    
        
        // Overloading
        // must different >> in signature

        int result = sum(2,5); // default is int // can be ambigious
        System.out.println("Result = "+result);
       
        
    }
}
