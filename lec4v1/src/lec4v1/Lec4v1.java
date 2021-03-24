
package lec4v1;

import java.util.Scanner;

public class Lec4v1 {
    
    public static void main(String[] args) {
        
         // Program Flow
        /*
        Sequential >> default >> Line by line
        Selection >> condition or decision >> if statement or switch statement
        Iteration >> Loops
        Transfer  >> getout from direction
        */
        
        // Selection
        // if statement >> simple if ,, if else ,, if else if 
        
        /* Simple if   general form
        
            if (Boolean expression){
                //body >> True
        }
        //false
        */
        /*
        System.out.println("Start");
        int x = 5;
        int y = 3;
        if (x>y){
            System.out.println(x+" is the Max");
        }
        System.out.println("End");
        */
          /* if else   general form
        
            if (Boolean expression){
                //body >> True
        }
        else{
        //false
        }
        */
          /*
          System.out.println("start");
          int x = 5;
          int y = 9;
        if (x>y){
            System.out.println(x+" is the Max");
        }
        else{
             System.out.println(y+" is the Max");
    }
            System.out.println("End");
            */
           /* if else if   general form
        
            if (Boolean expression){
                //body >> true
        }
          else if (Boolean expression){
        // body >> true
        }
          else {
        // body >> false
        } 
        */
           /*
           if(){
               
           }
           else{
               if(){ // it means else if
                   
               }
           else{
                }
           }
           */
           /*
          System.out.println("start");
          int x = 5;
          int y = 5;
        if (x>y){
            System.out.println(x+" is the Max");
        }
        else if (y>x){
             System.out.println(y+" is the Max");
    }
        else {
            System.out.println(x+" = "+y);
        }
            System.out.println("End");
           */
           /*
           System.out.println("Enter month# to know the season");
           
           Scanner input =new Scanner(System.in);
          int month =  input.nextInt();
          
          if (month >2 & month <6)
          {
              System.out.println("Season is Spring");
          }
          else if (month >5 & month <9)
          {
              System.out.println("Season is Summer");
          }
           else if (month >8 & month <12)
          {
              System.out.println("Season is Autumn");
          }
           else 
          {
              System.out.println("Season is Winter");
          }
          input.close();
          */
           // Another Way
           /*
           System.out.println("Enter month# to know the season : ");
           Scanner input =new Scanner(System.in);
          int month =  input.nextInt();

            if (month == 3 | month == 4 | month == 5)
          {
              System.out.println("Season is Spring");
          }
          else if (month == 6 | month == 7 | month == 8)
          {
              System.out.println("Season is Summer");
          }
           else if (month == 9 | month == 10 | month == 11)
          {
              System.out.println("Season is Autumn");
          }
            else if (month == 12 | month == 1 | month == 2)
          {
              System.out.println("Season is Winter");
          }
           else 
          {
              System.out.println("Error");
          }
            input.close();
           */
           /*
           System.out.println("Enter num to know Even or Odd : ");
           Scanner input =new Scanner(System.in);
           int num =  input.nextInt();
           if (num%2==0)
           {
               System.out.println("Number is even");
           }
           else{
               System.out.println("Number is odd");
           }
           input.close();
           */
           // Note : if body is single line we shouldn't adding brackets
           // Nested if means if in another if
           /*
           int x = 3;
          if (x<4)
          {
              if (x<3)
              {
                  System.out.println("Accept inner");
              }
              System.out.println("Accept outer");
          }
           System.out.println("End");
           */
           
           // Switch statement
           /* general form
                
           Switch (var name){
           case value1:
           // body
           break;
           
           case value2:
           // body
           break;

           case value3:
           // body
           break;

           default:
           // body
           break; // i can don't put default , because he will exit
           */
           
           System.out.println("Enter day : ");
           Scanner input = new Scanner (System.in);
           int day = input.nextInt(); // if int is char we put value is ''   String ""
           // Switch doesn't take data type >> long , double , float , boolean
           // Switch accept String(reference dataType)
           // break to stop
           
           switch (day)
           {
                   case 1:
                   System.out.println("Sat");
                   break;
                   case 2:
                   System.out.println("Sun");
                   break;
                   case 3:
                   System.out.println("Mon");
                   break; 
                   case 4:
                   System.out.println("Tue");
                   break;
                   case 5:
                   System.out.println("Wed");
                   break;
                   case 6:
                   System.out.println("Thu");
                   break;                   
                   case 7:
                   System.out.println("Fri");
                   break;      
                   default:
                   System.out.println("Error");
                   break;
           }
           
           /*
           System.out.println("Enter month : ");
           Scanner input = new Scanner (System.in);
           int month = input.nextInt();
           
           switch (month)
           {
               case 1:
               case 2:
               case 12:
                   System.out.println("Winter");
                   break;
               case 3:
               case 4:
               case 5:
                   System.out.println("Spring");
                   break;
               case 6:
               case 7:
               case 8:
                   System.out.println("Summer");
                   break;
               case 9:
               case 10:
               case 11:
                   System.out.println("Autumn");
                   break;
               default :
                   System.out.println("Invalid Number");
                   break;
           }
           input.close();
           */
           /*
           Scanner input = new Scanner (System.in);
           
           System.out.println("Please Enter num1");
           double num1 = input.nextDouble();
           
           System.out.println("Please Enter num2");
           double num2 = input.nextDouble();
           System.out.println("Please Specify Operator\n+ - * / ^");
           String assign =input.next();
           
           switch (assign)
           {
               case "+":
                       System.out.println(num1+num2);
                       break;
               case "-":
                       System.out.println(num1-num2);
                       break;
               case "*":
                       System.out.println(num1*num2);
                       break;
               case "/":
                       System.out.println(num1/num2);
                       break;
               case "^":
                       System.out.println(Math.pow(num1,num2));
                       break;
               default :
                       System.out.println("Error");
                       break;
                       
                       input.close();
                       */
        
    }
    
}
