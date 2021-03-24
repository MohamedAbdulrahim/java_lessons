
package lec4v2;

public class Lec4v2 {

    public static void main(String[] args) {
          // Iteration >> Loops >> for , while , do..while
        // 3 parts
        /*
        Iteration >> counter
        termination >> condition >> when Iam finish
        increment or decrement   
        */
        // for loop general form
        /*
        for (initialization(1)[Only one time], termination(2), increment(4))
        {
        Body (3)
        }
        */
        /*
        for (int i =1; i<=10;i++)//;   //  if I put ; loops then print HelloWorld! only one time
        {
            System.out.println("HelloWorld!"+i);
        }
        */
        /*
        for (int i =1; i<=10;i++)
        {
            if (i%2==0)
            System.out.println("even # "+i);
        }
        */
        
        // summation from 1 to 5
        /*
        int sum =0;
        for (int i =1; i<6;i++)
        {
            sum+=i;
        }
        System.out.println("Sum = "+sum);
        */
        
        /*
        int i=1;
        for(;i<=4;)
        {
            System.out.println(i);
            i++;
        }
        int j;
        for(j=0;j<=4;j++) // if i need j outside for loop
        {
            System.out.println(j);
            
        }
        
        
             for(j=0;j<=4;j=5) // loop for ever ,,j=0 then j=5
        {
            System.out.println(j);
            
        }
        System.out.println(j+"is j");
*/
        /*
        for (;;)// finite loop
        {
            
        }
*/
        // while..loop >> like if condition but execute more times when condition is true ,un excepted stop
        /* general form
        
        Initialization
        while(Termination)
        { // Body
        increment
        }
        */
        /*
        int i = 1;
        while (i<=10) // while making Check
        {
            System.out.println("HelloWorld!"+i);
            i++;
        }
        */
        /*
        int sum = 0;
        int i = 1;
        while(sum<=100)
        {
            sum+=i; // sum=sum+i;
            i++;
        }
        System.out.println(i);
        System.out.println(sum);
        */
        
        // do..while >> execute code at least one time even condition is false
        /* general form
        
        do{
        // body
        increment
        }
        while(Termination);
        */
        // do..while >> execute code at least one time even condition is false
        
        /*
        int i = 1;
        do{
            System.out.println("HelloWorld!"+i);
            i++;
        }while(i<=10);
        */
        /*
        Scanner input = new Scanner(System.in);
        int num;
        do{
            System.out.println("for new press 1\nfor open press 2\nfor help press 3");
            num=input.nextInt();
            
        }while(num<1||num>3);
        System.out.println("Valid");
        input.close();
        */
        
          /*
           Scanner input = new Scanner (System.in);
           
           System.out.println("Please Enter num1");
           double num1 = input.nextDouble();
           
           System.out.println("Please Enter num2");
           double num2 = input.nextDouble();
           
           String assign;           
           do {
           System.out.println("Please Specify Operator\n+ - * / ^");
           assign = input.next();
            
           }
           while(!assign.equals("+") && !assign.equals("-")&& !assign.equals("*") && !assign.equals("/") && !assign.equals("^"));
           
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
    */  
          
          // break : means stop all loop
          /*
          for (int i = 0; i < 7; i++) {
              if(i==4){
               break;   
              }
              System.out.println(i);
        }*/
          
          // continue : means stop loop then continue from start  
          /*
            for (int i = 0; i < 7; i++) {
              if(i==4){
               continue;   
              }
              System.out.println(i);
        }
            
            //  for each loop : for collection
            int [] a = {1,2,3,4};
            
            for (int i = 0; i <4; i++) {
                    System.out.println(a[i]);   
            }
            // OR
            for(int element:a){ // called for each loop , enhanced for loop >> can't modify in array but modify in element
                                                                         // >> must execute it on all element 
                System.out.println(element);
            }
            
            // making label >>  label: >>  break label;
            a: for (int i = 1; i <= 5; i++) {
                for (int j = 0; j < 10; j++) {
                    if(i==3)
                        break a;
                }
                System.out.println(i);
            }
*/
          

    }
    
}
