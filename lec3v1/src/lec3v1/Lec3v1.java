package lec3v1;

import javax.swing.JOptionPane;
import java.util.Scanner; // import statement
// java.lang >>> import automatic

public class Lec3v1 {

    public static void main(String[] args) {
        /*
       String input = JOptionPane.showInputDialog("Please enter a number");
       int x =Integer.parseInt(input); //we make a for loop walks on nums and see ascii code to convert it to number 
       System.out.println(x+10); // can give exception: number format exception
        x =Integer.parseInt(input,2); // binary number
        System.out.println(x);
        double y =Double.parseDouble(input);
        System.out.println(y+0.6);
         */
        //  java.util.Scanner input = new java.util.Scanner(System.in);
        // full qualified name >> take a copy from Scanner name it input
        /*
        Scanner input = new Scanner(System.in);  
      
        String name = input.next();
        System.out.println("Welcome "+name);
        input.close(); // close connection
         */
        //  java.lang >> import automatic like String ,, System ,, Math
        /*
        Scanner input = new Scanner (System.in);
        System.out.print("Enter num1 : ");
        double num1 = input.nextDouble();
        System.out.print("Enter num2 : ");
        double num2 = input.nextDouble();
        
        double result = num1 + num2;
        System.out.println("Result = "+result);
        
        input.close();
         */
        // ctrl + shift + f >> Rclick > Source > Format >> for regulate lines in Eclipse

        // Math
        // Basic functions >> max ,, min ,, abs ,, round ,, ceil ,, ....
        // Exponential & Logarithms >> pow ,, sqrt ,, log ,, ....
        // Trigonometric functions >> sin ,, cos ,, tan ,, ....
        /*
            int x = 10; 
            int y = 20;
            
            int result = Math.max(x,y); // call max method in Math class
            System.out.println(result);
         */
        // Note : if you need to change class name  >> (Refactor) to change code name
        // Note : if you need to change variable name >> Rclick on var then Refactor then Rename
        /*
            int x = -10;
            int result = Math.abs(x); // abs (Absolute) means remove sign
            System.out.println(result);
            
            float num = 3.6f;
            System.out.println("almost = "+Math.round(num));
         */
        //  round 2.8 >> 3  ,,  2.4 >> 2
        //  ceil  5.9 ,, 5.1  >> 6
        //  floor 3.4 ,, 3.7  >> 3
        /*
            double x = 4; 
            double y = 2;
            double result = Math.pow(x, y);
            System.out.println(result);
         */
 /*
            double x = 4;
            System.out.println(Math.sqrt(x));
            System.out.println(Math.log(x));
            System.out.println(Math.sin(x));
         */
 /*
            double x = -5+Math.sqrt(Math.pow(-5, 2)-4*(1.0/2)*(1.0/3));
            //0.5 != 1/2 ,, 0.5 =1.0/2 is double ,, 1/2 is int
            
            double y = 2*(1.0/3);
            
            // double / int = double  ,, int / double = double ,, long / double = long ,,, such and such .....
            
            double result = x/y;
            System.out.println("Result = "+result);
         */
        // Random
        
        // 0.0 <= Math.random() < 1.0

        System.out.println((int)(Math.random()*10));
        System.out.println((int)(Math.random()*10));
        System.out.println((int)(Math.random()*10));
        // Constant in Math >> pi   e
        // Area of circuit = pi r^2
        // Circumference = 2 pi r
    }

}
