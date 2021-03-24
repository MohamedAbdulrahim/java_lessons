
package lec12v3;

public class Lec12v3 {
// if i send parameter int going to int then primitive(Casting) then Reference(AutoBoxing)
    public static void main(String[] args) {
        
        // AutoBoxing,AutoUnBoxing >> 
        // compiler make things automatic not must programmer make it >> for simple
        
       
        /*
            Wrapper Classes : deals only with objects like String
            // convert primative to Object 
            // convert Object to primitive
        
        Wrapper Classes :
        Byte
        Short
        Integer
        Long
        Float
        Double
        Character
        Boolean 
        */
        // used to change the value in method
       
         int x = 7;
        // primitive to object
        Integer objNum = new Integer(x); // Boxing
        System.out.println(objNum);
        // OR
        Integer objNum2 = x; // Auto Boxing
        Integer objNum22 = 5; // Auto Boxing
        
        System.out.println(objNum22);
        
        ///////////
        
        Integer objNum3 = new Integer(9);
        int num3 = objNum3.intValue(); // unBoxing
        // OR
        int num4 =objNum3; // Auto unBoxing  ,, this structure in compiler not in library
        
        //////////////
        
        String strNum = "7";
        int n = Integer.parseInt(strNum); // parse means String to int
        System.out.println(n);
        /*
        String strNum2 = "7.5";
        double n2 = Integer.parseInt(strNum2); 
        System.out.println(n2); 
        // given error >> parseInt
      */  
        
        String s1="ali";
        String s2="ali";
        String s3 = new String("ali");
        // s1,s2 refer to one Object , s3 refer to another Object
        
        double d= 3; // Casting 
        // Double dd = 3; // given error >> Double dd = new Integer(3);
        
        Double dd = 3.0; // AutoBoxing
        //OR
        Double d1 = (double)3;// AutoBoxing & Casting
        
        
        Object o = 3;
        Number nu = 7;
        
        
        Integer inte = null;
        int in = inte; // given Error : NullPointerException
        
        // primitive can't have null >> int x >> given compile error
        // reference can have null >> Integer x = null;
        
        
    }
    
}
