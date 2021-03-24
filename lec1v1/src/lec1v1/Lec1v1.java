
package lec1v1;

public class Lec1v1 {

    public static void main(String[] args) {
      
            //  SDLC : Software Development Life Cycle
    
    /*
    SDLC >>
            Requirement Analysis
            Design : like Flow Charts (how program run)
            Implementaion >> coding
            Testing
            Evolution >> Update or Modify    
    */  
       //  IDE : integrated development environment
                    
       /*
      common java ide's (template)
        JDeveloper (Oracle)
        Netbeans
        Eclipse
        RAD(Rational Application Developer (IBM))
        
       Note : some times certain ide have additional library(Not standard) not exist in another ide 
              but we can add it not automatic  
       */
       
       // Note : if we connect on database Oracle we need a driver(jdbc driver)
       // jdbc driver -- there is a driver for Oracle different of a driver of SqlServer -- any database has it's own driver
      
       
       // the different version of jdk can make difference in compiling - because different libraries and different compiler program
       
       //  JDK : java development kit ( Java creating by Sun Microsystem)
       /*
       JDK is a file
       >> libraraies (APIs) or classes -- developer doesn't make program from skratch 
       >> executable files like : compile(javac) - run(java) - documentaion(javadoc) - jarFile(jar) - debug 
       >> The javap tool is used to get the information of any class or interface.
          The javap command (also known as the Java Disassembler)
       */
       // Note : we should work with the same jdk -- because can be some libraries can't be exist -- or rules of comiling
       
       // jre(java runtime environment): to execute java program for user,, consists of jvm and java binaries and other classes     
       
       // there are versions of jre
       
       // jvm (java virtual machine) : , loading classes in memory , convert byte code into machine code ,, jvm platform dependent
       // java program Structure
       
       // Workspace : folder representing the entire context of certain application
       // project : folder inside the Workspace representing a complete module or a partial work within the application
       //  Note : if java file see another java file is called classpath
       // Note : java code write in file saved (fileName.java) >> java class
       // class : like library
       // (.java) classes related together classification in package (folder)
       // Application > Projects > packages > Classs > Methods > java commands
       
       // JDK classes are organized into packages ,, like java.sql, java.io,....
       
  /*     
       Features of Java

The features of java are also known as java buzzwords

1- Simple
2- Object-Oriented
3- Portable
4- Platform Independent
5- Secured
6- Robust
7- Architecture neutral
8- Interpreted
9- High Performance
10- Multithreaded
11- Distributed
12 – Dynamic
 
1- Simple

Java is very easy to learn, and its syntax is simple, clean and easy to understand.
According to Sun, java language is a simple programming language because:

1- Java syntax is based on C++ (so easier for programming to learn it after C++)

2- Java has removed many complicated and rarely- used features
Ex: explicit pointer, operator overloading, etc.

3- There is no need to remove unreferenced objects because there is an Automatic Garbage Collection in java
 
2- Object-Oriented

Java is an object-oriented programming language.
Everything in java is an object.
Object-oriented means we organize our software as a combination of different types of objects that incorporates both data and behavior.
Object-Oriented programming (OOPs) is a methodology that simplifies software development and maintenance by providing some rules.
Basic concepts of OOPs are:
1- Object
2- Class
3- Inheritance
4- Polymorphism
5- Abstraction
6- Encapsulation
 
3- Platform Independent

Java is platform independent because it is different from other languages like C, C++, etc. which are compiled into platform specific machine while java is a write once, run anywhere language (WORA).
Platform is the hardware or software environment in which program runs.
There are two types of platforms software-based and hardware-based.
Java provides a software-based platform.
It has two components:
1- Runtime Environment
2- API (Application Programming Interface)

Java code can run on multiple platforms, for example,
Windows, Linux, Sun Solaris, Mac/OS, etc.
Java code is compiled by the compiler and converted into bytecode by jvm.
This bytecode is a platform-independent code because it can be run on multiple platforms.
Write Once Run Anywhere (WORA).

4- Secured

Java is best known for its security. With java, we can develop Virus-free system.
Java is secured because:
1- No explicit pointer
2- Java programs run inside a virtual machine sandbox
3- Classloader
4- Bytecode Verifier
5- Security Manager
---------------------------------------------
Classloader: Classloader in java is a part of the java runtime environment (JRE) which is used to load java classes into the java virtual machine (JVM) dynamically. It adds security by separating the package for the classes of the local file system from those that are imported from network sources.

Bytecode Verifier: it checks the code fragments for illegal code that can violate access right to objects
 
Security Manager: it determines what resources a class can access such as reading and writing to the local disk.
 
5- Robust

Robust means Strong. Java is robust because:

1- It uses a strong memory management
2- There is a lack of pointers that avoids security problems.
3- There is automatic garbage collection in java which runs on the java virtual machine (JVM) to get rid of objects which are not being used by a java application anymore
4- There are exception handling and the type checking mechanism in java.
*/
       
    }
    
}
