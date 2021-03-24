
package lec13v1;

import java.util.ArrayList;
import java.util.List;
// Note String make Override of equals method
public class Lec13v1 {

    public static void main(String[] args) {
        
        // Collections and Maps
        
        // Array is fixed size, Collection is dynamic size
        // Collections : how to store Object dynamically
        
        // Interface can extends Interface
        
    // Polymorphism 
      // if i Create Object i can hold reference (same type , super type , Interface implement it directly or not directly)
      ClassT ct = new ClassT();
      I i = new ClassT();
      I1 i1 = new ClassT();
      I2 i2 = new ClassT();
      
      // if classA extends classB ,, classB implement InterfaceA >>> classA can Overload methods from InterfaceA
      
      
      // Collection Interface
      
        // List Interface >> extends Collection  ,, some classes implement List Interface like > ArrayList , Vector , .... 
        // Set Interface  >> extends Collection  ,, some classes implement Set Interface like > HashSet , TreeSet
        // Map Interface  ,, some classes implement Map Interface like > HashMap , TreeMap , HashTable
                                //  this Interfaces used to store Objects dynamically
        
        // List Interface : used when i need the order(index)(position) of Object
        // Set Interface : used when i need making discrite                        
        // Map Interface : used in search ,, performance is very fast in searching ,, 
                           // the technique : hashFunction >> key,value 
                           // can make collesion(bad thing)
        
                           // I can't open Object from Interface
        List<String> a = new ArrayList<String>(); // we can change String to any thing like employee class or any class
        a.add("mohamed"); // add in index 0
        a.add("khalid"); // add in index 1
        a.add("ahmed"); // add in index 2
        a.add(1,"Tamer"); // add in index 1 and making shift
         //   a.add(5,"math");
        // add must be in the range ,, if not >> IndexOutOfBoundException
        System.out.println("a = "+a);
        
        
        List<String> a2 = new ArrayList<String>();
        a2.add("mohamed"); // add in index 0
        a2.add("khalid"); // add in index 1
        a2.add("ahmed"); // add in index 2
        a2.add(1,"Tamer"); // add in index 1 and making shift
        a.addAll(a2);
        System.out.println("a = "+a);
        a.addAll(2,a2);
        System.out.println("a = "+a);
        // List Allow redudancy
        
        System.out.println("size = "+a.size());
      //          a.clear();
        System.out.println("size a after clear "+a.size());
        
        // vector : most methods are synchronized
        // Arraylist : not synchronized
        
        
        System.out.println("Object 1 = "+a.get(0)); // given rangeCheck if making clear
        
        for(String str : a){
            System.out.println("Names are : "+str);
        }
        
        String ss = a.set(3, "Amin"); // set making replace
        System.out.println("Replace:"+ss+" To:"+a.get(3));
        a.set(4,null); // allocated till null
        System.out.println(""+a);
        
        boolean b = a.remove("Tamer"); // remove the first location not complete 
        a.remove(5); 
        System.out.println("after remove "+a);
        
        boolean bo = a.contains("Amin"); // if i need to know this object is exist or not
        System.out.println(bo);
    }
    
}
