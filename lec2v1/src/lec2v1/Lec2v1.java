
package lec2v1;
// import java.lang.*; // any class in java.lang >> import Automatic 
import java.lang.System; // import Automatic 

import java.awt.Toolkit; // to make beep

public class Lec2v1 {
            // class Upper camel case
    
    // int x; >> global variable ,, take value over compiler
    public static void main(String[] args) {
               
        // int x; >> local variable
        
        // if i'm in static method i can't call non static variable  
        
        //  Single Comment
        
        /*
        MultiLine Comment
        */
        /*
        // Escape Sequence (special character) / >> to make specific format of printing
                            // because some special character can make problems in printing
        System.out.print("Hello World!"); 
        System.out.println("Mohamed"); // print then down
        System.out.println("For short cut >> sysout in Eclipse");
        System.out.println("For short cut >> sout in Netbeans");
        System.out.println("For short cut >> sop in JDeveloper");
        System.out.println("\\"); // Escape Sequence
        // + Meaning add or concatenate
        System.out.println(2+5); // meaning add
        System.out.println("Java"+8); // meaning concatenate    ,,, Java > token1  , 8 > token2
        System.out.println("3*4="+3*4); // multiply has priority more than concate
        //System.out.println("3-4"+3-4);// compile error
        System.out.println("3-4"+(3-4));
        System.out.println(2+3+"Java"+5+9);
        System.out.println(2+3+"Java"+(5+9));
        System.out.println("c:\\");
        //System.out.println("abc\def"); // compile error because backSlash
        System.out.println("\"");
        System.out.println("'Hi'"); // no problem in single qutation
        System.out.println("\n"); // for NewLine
        System.out.println("\t"); // for Tab 
        Toolkit.getDefaultToolkit().beep(); // to make beep sound
        */
        /*
        System.out.println("\\\"Start\"\\:\n6+3 = "+(6+3)+"\n6-3 = "+(6-3)+"\n6*3 = "+(6*3)+
                            "\n6/3 = "+(6/3)+"\n\\\"End\"\\");
        */
        // Note >> insert change cursor type
        
        
        
        // Variables  >> lower camel case
        // scope
        {
        //  life time of variable between {  }       
    }
        {
            int x = 5; // start x
        } // end x
        
        {
            int x = 5; // start x 
        }// end x
        
         
        // profilers : follow the performance of program
        
    
                        // variable must declared once anyWhere before using it
                        // variable has scope and lifeTime    
           // first method Declaration then Initialization
        // in main method >> local = method = localmethod variables
        /* 
        
        int x; // Declaration step      x is a variable
        x = 7; // Initialization step

        int y; // Declaration step      y is a variable
        y = 9; // Initialization step
         */
 /*  
        // second method Declaration with Initialization
        
        int x = 10;
        int y = 15;
         */
 /*
        // third method All declaration then All initialization
        
      int x,y;
      x=4;
      y=9;
         */
        
        /*
      // last method declaration with initialization in on line
      int x=4,y=7;
         */
        
        // Note : Java is case sensetive X!=x
        /*
        int x = 15;
        System.out.println(x);

        x = 9;
        System.out.println(x);

        x = 3;
        System.out.println(x);
*/
            // Constant meaning never change
        /*
        final int X = 20; // final meaning constant
        X = 10; // compile Error 
        */
        // another way
        /*
        final int X;
        X = 15;
*/
    // no class can extends final class
    // no method can Override if Override from final method
    
    
    
    // Data type
      // Data Type >> Primitive (8)  &  Reference(Unlimited)
    
    
// primitive
    // store in stack
    // primitive data type can store only one value at a time , x=10; 
    /* Integers
        byte = 8 bits   2^8 divided to + & - >> = -2^7 >> +2^7-1      -1 >> because counting Zero
        short = 16 bits   
        int = 32 bits  // int is default
        long= 64 bits
    */
    /* Floating Point
        float = 32 bits
        double = 64 bits // double is default
    */
    /*
        char = 16 bits carry only one character  ,, 16 bits because unicode >> java support unicode
        boolean = true or false
    */
    /*
        boolean b;
        b = 412*12>50*9;
        System.out.println(b);
        // !=  not equal
        b = 412*12!=50*9;
        System.out.println(b);
        // ==  equal for assignment
        b = 412*12==50*9;
        System.out.println(b);
        */
        // {Interface has managed beana >> must pass over converter/validator}
        
        
        
        // Casting >> Primitive Casting ,, Polymorphism Casting(the relation between super and sub)
        
        // Primitive Casting (8) >> Implicit & Explicit
        // Implicit >> put small size in big size
        // Explicit >> put big size in small size
        
        // Implicit 
        /*
            short x = 5;
            double y = x;
            System.out.println(y);
        */
        // Explicit
        /*
            double x = 8;
            byte y =(byte) x;       // because double bigger than byte
            System.out.println(y);
            */
        /*
            double a = 975;
            byte b =(byte) a;       // because double bigger than byte
            System.out.println(b);  // print random number because byte in range 8 bits
            */
        // Note : boolean doesn't change
        /*
        // Character
        char c1 = 'a';
        System.out.println(c1);
        c1=98;
        System.out.println(c1);
        c1='4';
        System.out.println((int)c1+" >Ascii> 4");
        c1=10;
        System.out.println(c1 +" ascii code for enter is 10");
        char c = 'A'; // char >> 16 bits
        int i = c ; // implicit >>>> int = 32 bits 
        System.out.println(i); // print Ascii code
        c='F';
        if (c>=65 && c<=90)
            System.out.println(c+" done");
        int x='a';System.out.println(x);
         x='z';System.out.println(x);
         x='A';System.out.println(x);
         x='Z';System.out.println(x);
         x='0';System.out.println(x);
         x='9';System.out.println(x);
         */
         /*
         // Unicode recover all language ,, Universal
         
          c ='\u0a51'; // HexaDecimal 
          System.out.println(c);
          c ='\uf051';
          System.out.println(c);
        */
        /*
        int x = 45; // Decimal (base 10)
        System.out.println(x);
        
        x = 0xa ; //  HexaDecimal (base 16)
        System.out.println(x);
        
        x = 012; // Octal (base 8)
        System.out.println(x);
        
        x = 0b1010; //  Binary (base 2)
        System.out.println(x);
        
        double d = 1234.567;
        System.out.println(d);
        
        d = 12.34567e2;    //  e for direction
        System.out.println(d);
        
        char c = 'a';
        System.out.println(c);
        
        c = 97;        // Asci code =7 bits = 128 char     
        System.out.println(c);
        
        c = '\u0061';    // Unicode >> Hexadecimal >> 6 digit 
        System.out.println(c);
        
        boolean b = true;
        
        System.out.println(b);
        */
        
        // UnderScore
        /*
        double d = 2.5;
        float f = 2.5F; // default is double in Floating-point 
        double d2= 2249575419415d; //  end with d because default is int
        long num1 = 1625626514641L;    // end with L because default is int
        long num2 = 162_562_651_464_1L; //  _ for more clear
        */
         
         /*
        int i  = 97;
        char c = (char)i; // character of 97 is a
        System.out.println(c);
        */
        // Note : long num = 894561651651L; // L means casting from int to long
        /*
        double d = 64.48;
        char c = (char)d;   // in 64.48 remove .48 and transform it to 64 Ascii code
        System.out.println(c);
            */
    
// Reference 
    // store in heap
    // can store more than one value store in object ,, reference refer to object
    // famous reference is String
    /*
    int x=20;
    
    Integer q=(Integer)x;  // or   Integer q=x;
    
    String y=q.toString();
    
    System.out.println(y);  // print String y
    
    // clone for copy data(Object)
    */
    }
}
    

