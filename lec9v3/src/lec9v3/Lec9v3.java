package lec9v3;

public class Lec9v3 {

    public static void main(String[] args) {
        

         // Polymorphism
            // rule 1 : can create Object from subclass and reference from superclass
         Shape c1 = new Circle(); // can create Object from subclass and reference from superclass
         Object o1 = new Circle();
         
            // rule 2 : if i let superReference of subObject i can't access all thing in subclass
         Shape c2 = new Circle();
        // c2.
          // if i let superReference of subObject i can't access all thing in subclass
          
          // but how to return c2 to reference of Circle >> making polymorphism casting 
          Circle c;
          c=(Circle)c2; 
          
          /* Given error >> class cast Exception
          Shape c1 = new Circle();
          Square c2;
          c2=(Square)c1;
          */
          
          
          // instanceof Operator >> to check what reference refer to Which Object ,, instanceof return true or false
          
          if(c1 instanceof Square){ // means c1 refer to Square class or sub classes of Square
              Square s2;
              s2 = (Square)c1;
          }
          else{
              if(c1 instanceof Circle){
              Circle s2;
              s2 = (Circle)c1;
              }
          }
          
          
          // withOut polymorphism >> Big Code
          Shape sh = Abc.createShape();
          if(sh instanceof Square){
              Square s = (Square)sh;
              System.out.println("Square area = "+s.area());
          }
          else{
              Circle ci = (Circle)sh;
              System.out.println("Circle area = "+ci.area() );
          }
          
          // there is another way by Polymorphism
          double a = sh.area(); // because Circle & Square 'Override' area ,, compiler see i call area in shape
          System.out.println("area = "+a);
          
        // equals in Object class > > equals used to compare Objects
        // String make Override of equals method
        
        // toString >> return type of Object.. but make Override to return data of Object 
          
          
          /*/*
              // polymorphism : in real life >> action can make by more ways >>
                                    // like transportation > car , plane , train > result of object is different
    
    // there are 2 rules
    /*
    Rule1 :::
    
    Circle cir = new Circle();
    Circle inherited from >> Shape inhetited from >> Object
    Shape sh = new Circle(); // reference of Shape , Object of Circle
    Object ob = new Circle(); // reference of Object , Object of Circle
    
    Casting >> primitive , polymorphism
    polymorphism casting >> relation between parent & child
 
    */
    /*
    // UpWard Casting
    Circle cir = new Circle(10); // see only Circle contains & Shape contains & Object contains
    Shape sh = new Square(10);  // see only Square contains & Shape contains
    Object ob  = new Square(10); // see only Object contains
    */
/*
    Square sq = new Shape();
*/ // Shape can't converted to Square
 
//25.20
         
    }
    
}
