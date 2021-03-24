package lec8v2;

import java.util.Arrays;
import java.util.Scanner;

public class Lec8v2 {

    
public static int[] doSomthing(int[]x){

int[] myArr={10,20,40};    
return myArr;
}
    /*
    
    ......... void doSomething(int[] x){
    }
     main >>> doSomething(myArr);
    
    
    ........int [] doSomething (int[] x){
    return myArr;
    }
    main >>> int [] x = doSomething(myArr); // x to take array
    
    */
    public static void main(String[] args) {
        
        // Array
        
        
        // Array , collection >>  container
        // object means take a copy
        // Array is a class
        /*
        
        Array >> single dimensional array ,, multi dimensional array
        
        single dimensional array >> primitive , reference
        multi dimensional array >> primitive , reference
 
        */
        // Declaration & Creation
        
        // int[] myArr; // Declaration , means myArr=null ,, 
        // myArr=new int[5]; // 5 is the size means myArr=5
        // myArr is a reference contain hashcode (address) of Array
        
        int[]a; // i don't put size her because it's reference not Object ,, because i can refer to another object
        a=new int [5];
        a=new int[10];// index a from 0 to 9
        System.out.println(a.length); // 10
        
   //int [] myArr=new int[5]; // max size of array is max size of Integer ,, if size too big , heap can't allocate storage
        
        // Default
        /*
        Integers 0
        Floating point 0.0
        Boolean false
        char '\u0000'
        
        */
        /*
        int myArr[]=new int[5]; // new keyword >> object
        /*
        int x[] , y ;// x is array , y is a variable
        int [] x ,y ; // x , y are arrays
        // last index = size - 1

        myArr[0]=95;
        myArr[1]=50;
        myArr[2]=96;
        myArr[3]=75;

        System.out.println(myArr);// print hashcode , className@hashcode
        */
        int[] myArr={9,6,7,10,15}; // known data , limited
        
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        int[] myArr2 ={7,9,t};
        for (int i=0;i<myArr2.length;i++){
            System.out.println(myArr2[i]);
        }
        myArr[2]=82; // Override
        
        // Access >> call element
        /*
        System.out.println(myArr[1]);
        System.out.println(myArr[2]);
        System.out.println(myArr[9]); // Error >> because size = 5
    */    
        // Going through array >> how to pass on array
        // length in array >> constant size
        /*
        for (int i = 0; i < myArr.length; i++) {
            
            System.out.println(myArr[i]);
        }
        
        for (int i = 0; i < myArr.length; i++) {

            if (myArr[i]%2!=0) {
                System.out.println(myArr[i]+" is Odd number");
            }
        }
*/
        /*
        int [] arr={1000,2000,2500,3200};
        double sum=0;
        
        for (int i = 0; i < arr.length; i++) {
        sum=+arr[i];            
        }
        double avg=sum/arr.length;
        System.out.println("Avg = "+avg);
        */
        /*
        int x[]=doSomthing(myArr);
          for (int i = 0; i < x.length; i++) {
            
            System.out.println(x[i]);
        }
        x[0]=100;
        for (int i = 0; i < x.length; i++) {
            
            System.out.println(x[i]);
        }
        x=doSomthing(myArr);
         for (int i = 0; i < x.length; i++) {
            
            System.out.println(x[i]);
        }
        
        */
        int [] ar = {3,1,7,4,9}; 
        
        for(int i=0;i<ar.length;i++){
            int k;
            k=ar[i];
            System.out.println("k = "+k);
        }
        // the same
        for(int k:ar){ // for each element of ar put it in k 
            System.out.println("k = "+k);
        }
        // for each element : work on all element , can't access array direct, can't change in array
        
        //  Arrays class >> 
        Arrays.sort(ar);
        System.out.println("Array sort ");
             for(int k:ar){ 
            System.out.println("k = "+k);
        }
             
             // any Object has variable called length
             
             // Two Dimensional Array >> more used in image processing
             int[][] arra = new int[3][5]; // [row][column] >> [0,1,2][0,1,2,3,4] >> {n,n,n},{n,n,n},{n,n,n},{n,n,n},{n,n,n}
            
             for(int i=0;i<arra.length;i++){
                for(int j=0;j<arra[i].length;j++){
                    System.out.print(arra[i][j]+"\t");
                }
                 System.out.println();
             }
             
             Circle[] c = new Circle[100]; // 100 references of Circle , one Object of Circle
             // like 
             Circle c1;
             Circle c2;
             Circle c3; 
             // more
             
             for(int i=0;i<c.length;i++){
                 c[i]= new Circle();
             }
             
             
             
            //  Data Structure : Arrays or Collections
    // Array : Single Dimensional Array , Multi Dimensional Array ,,,,, Primitive , Reference
    // Array : size is fixed & have only one data Type ,, array is faster than collection
        
    
    
   // Monitor [] myArr = new Monitor[3/*size is int 2^32-1> maxSize , but jvm can't do all it*/]; // default value is null
    //Monitor mon1 = new Monitor("sony", 5, "black", 50);
   /* Monitor mon2 = new Monitor("hp", 3, "white", 30);  
    myArr[0]=mon1;
    myArr[1]=mon2;
    System.out.println(mon1+"\n"+mon2);
    */
   //OR
   /*
   Monitor []myArr = new Monitor[3];
   myArr[0] = new Monitor("sony", 5, "black", 50);
   myArr[1] = new Monitor("hp", 3, "white", 30);
   for(int i = 0;i<myArr.length;i++){
       System.out.println(myArr[i]);
   }
*/
   // Collection >> dynamic , can have more than one dataTypes , Collection is a frameWork
   // Collection of List >> Dublication , index
   // Collection of Set >> Unique
   // Collection of Map >> keyValue
    }
    
}
