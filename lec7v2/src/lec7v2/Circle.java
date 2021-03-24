
package lec7v2;

public class Circle {
    public double x,y;
    private double radius;
    
     {
         System.out.println("int1");
     }
   // Initializer block  {   }  >> used when creating curret object , the first thing ,, can replace method work 
     // work automatic with any constructor
     {
        System.out.println("Welcome Initializer");
        // brand="lenovo";
        // size =21;
        //price = 55;
}
    public Circle() {
        // can write initial code ,, like bring data from database
        System.out.println("circle created");
    }
// first does intializer block then constructor
    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        setRadius(radius);
    }

    private Circle(double y, double radius) { // if i don't need user access constructor (private)
        this.y = y;
        setRadius(radius);
    }
    public static Circle createCircle(){       
        return new Circle(0,0);
    }


    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius>=0)
        this.radius = radius;
        else
            throw new RuntimeException("radius can't be negative");
    }
    
    public Circle(double y){
        new Circle(y,0); // create Object and return it to Circle(,) constructor
    }
    
       // Constructors
            // constructor : has the same name of class 
            // doesn't have return
            // can have any access modifier public,protected,package,private
            // passing constructor value to constructor by this( )
            // this( ) only used in constructor and must written at first line
       
         // Constructor : is a special method 
    /*
    >> can called only at time when creating object >>> new Circle()
    >> to construct object
    >> put default value in memory
    >> can be Implicit or Explicit
    >> Implicit : java make constructor
    >> Explicit : make constructor by yourself
    */
    
    /*
    >> Reference : is a variable has hashcode(address)
    >> full qualified name : class name + package name
    >> Memory divided into >> stack ,, heap
    >> variables put in stack >> end when scope is end
    >> objects put in heap >> ended by garbage collector (GC) under jvm
    >> finalize() >> used for doesn't remove object from memory
    >> String id; // number doesn't calculate >> String not int >> because it can start by 0 
    >> if there is no constructor java make in run time default constructor
                        >> no args constructor more important in inheritance
    
    */
    // java create constructor if no constructor found
    
    /*
    //Sharing constructors >> this(   ) >> only for constructor
    
    public Employee(){ // No args constructor ... args = arguments
        this(null,null,null,0.0);
    }
    public Employee(String name){ // parametrized constructor
        this(null,null,null,0.0); // calling biggest constructor , must be in the same class
        // name=n;
    }
    /*
    public Employee(String n,String a , String i, double s){ // method for clearing
        name=n;
        address=a;
        id=i;
        salary=s;
    }
    
        public Employee(String name,String address , String id, double salary){ // method for clearing
        //name=name; // local (name) = local (name) >> because he see only local variable >> Shadow
      //  this.name=name; // this for Fields
        this.address=addrsess;
        this.id=id;
        this.salary=salary;
    }
    */
    
    
}
