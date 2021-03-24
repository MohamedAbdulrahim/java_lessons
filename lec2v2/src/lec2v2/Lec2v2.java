
package lec2v2;

public class Lec2v2 {

    public static void main(String[] args) {
         // UnaryOperators   ++  --
        /*
        int x = 5;
            //  Postfix >> using first
        System.out.println(x++);
        System.out.println(x);
         */
        /*
        int y = 9;
            //  Postfix >> using first
        System.out.println(y--);
        System.out.println(y);
        */
        /*
        int x = 4;
            //  prefix >> using after
        System.out.println(++x);
        System.out.println(x);
        
        
        int y = 4;
            //  prefix >> using after
        System.out.println(--y);
        System.out.println(y);
*/
        
        // Relation Operators
        // >    <   >=  <=  ==  !=
        /*
        int x = 5;
        int y = 9;
        
        boolean z = x!=y;   //  != >> NotEqual
        System.out.println(z);
        */
        
        // LogicalOperators
        // &&(And)   ||(OR)  ^(XOR)   !(Not)
        /*
        int x=5;
        int y=6;
        int z=2;
        
        //  &&  ||    >> short circuit operators >> if result known doesn't complete
        
        boolean result = x<y && z<x;
        System.out.println(result);
        System.out.println(!result);
*/
        //  Bitwise Operators
            //more using in Networking
        // &   |    >> if result known also complete
        /*
        int x=5;
        int y=6;
        int z=2;
        boolean b = x>y&x<z;
        System.out.println(b);
        
        // using in networking
        x = 3;
        y = 6;
        int z =x&y;
        System.out.println(z);
         z =x|y;
        System.out.println(z);
        
        int a =4;
        if (6>8 & ++a>2)
            System.out.println(a);
        */
        
        // here must bitwise to complete
        /*
        int x=5;
        int y=6;
        
        boolean b = x > 10 & x < y++; //if we use logical operators it doesn't increase y
        */
        /*
        int x= 10; 
        int y=0;
        
        boolean b = y!=0 && x/y>10;     // if we use bitwise given error
        System.out.println(b);
        */
        
        // Conditional Operators  (ternary)
        //  (condition)? true:false
     /*   
        int x =10;
        int y=20;
        
        int max = (y>x)? y:x;
        System.out.println("Max ="+max);
*/
     // Arithmatic Operators + -  * / %
     
        // Assignment Operator  =
        // int x = 10;
        
        // Compound Assignment Operator
        //  +=      -=      *=      /=      %=
       /*
        int x=5;
        x+=2;  // x=x+2
        int y = 2;
        y*=3+4; // y = y*(3+4)
        System.out.println("x = "+x);
*/
       /*
       int z=3;
       z+=5*9;
        System.out.println(z);
       */
       /*
       int num1, num2, num3;
       num1=num2=num3=4;
       System.out.println(num1);

*/
       // Arithmatic
       
       double x =42.456 % 2;  // reminder
        System.out.println(x);
       
     
     
    }
    
}
