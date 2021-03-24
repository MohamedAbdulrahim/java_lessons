package lec3v2;

public class Lec3v2 {
        
    public static void printMsg ()  // Define Method
{                               // order verb doSomething()
                                // if math have the same math function sqr()
                                // isEmpExist() >> return true or false
    System.out.println("HelloWorld!");
} // Method Declarations
    public static void sayHello(String name) {
        System.out.println("Hello "+name);
    }
    public static double sum(double num1,double num2) {
        
        double result = num1 + num2;
        return result;  // pass by value
    }
    public static void doSomething(int x){
        if (x>5){
            System.out.println("x bigger than x");
            return; // return means exit
           // another code unreachable statement
            
        }
    }
    public static void main(String[] args) {
        // Method >> Header , Body
        /* Method : perform specific task , have specific input , specific output
                    Organize program
        Header >> Access Modifier (#1) , return type (#2) , method name (#3) , parameter list (#4)
        
            modifiers >>
                access modifiers >> public , private , package , protected
                Non access modifiers >> final , static , abstract , ..... 
        
            return type >> 
                void
                data type >(primitive , reference)> double , int , String ,.....
            
            method name >> Identifiers , convention >> verb , meaning full , lower camel case
        
            parameter list >> () , (double num1 , double num2)
        
        // Method
        
        // header{
        //        body   }
        
        */
        Lec3v2.printMsg(); // call method
        printMsg(); // because it's in the same class
        
        String name="Mohamed";
        sayHello(name);
        
        double num1=5.5;
        double num2=3.3;
        double result= sum(num1,num2);
        System.out.println("Result = "+result);
        
    }
}
