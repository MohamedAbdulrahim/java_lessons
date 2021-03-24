
package lec13v2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lec13v2 {

    public static void main(String[] args) {
        
        // Set Interface
        
        Set<Integer> s1 = new HashSet<>();
        
        // Note: this methods modify in Object
        boolean b1 = s1.add(1); // Set Interface doesn't add redundant
        System.out.println("if 1 add : "+b1);
        boolean b2 = s1.add(1);
        System.out.println("if 1 add : "+b2); // false because 1 is already exist
        // no position in Set Interface
        
        // in math {1,3,6} the same {3,1,6} ...0Oo0
        
        s1.add(3);
        s1.add(2);
        s1.add(5);
        
        
       // CompareTo
       // clone
       // TreeSet is arrange values
       
       
       
       System.out.println("s1 = "+s1);
       //OR
       for(Integer i:s1){ 
           System.out.println(i+2);
       }
       //OR
       Iterator<Integer> it = s1.iterator(); //iterator : return the same value of s1 but in Iterator structure ,,
                                            // iterator if you have some thing give him 
       while(it.hasNext()){
          Integer i = it.next();
           System.out.println(i);
       }
        
       Set<Integer> s2 = new HashSet<Integer>();
       s1.clear();
       
       s1.add(11);
       s1.add(12);
       s1.add(13);
       s1.add(14);
       s1.add(15);
       s1.add(16);
       s1.add(17);
       s2.add(11);
       s2.add(12);
       s2.add(13);
       s2.add(14);
       s2.add(15);
       
       
       s1.addAll(s2); // s1 union s2
                        // return Boolean > if object change > true ,,,, not change > false
       System.out.println("s1 after union : "+s1);
       
       
       s1.retainAll(s2); // s1 intersection s2
                        // return Boolean > if object change > true ,,,, not change > false
        System.out.println("s1 after Intersection : "+s1);
       
        s1.removeAll(s2); // s1 remove any object like s2
        System.out.println("s1 after removeAll s2"+s1);
        
        
        // if i need to make copy of s1
       Set<Integer> s3 = new HashSet<Integer>(); 
       s3.addAll(s2);
       //OR
       // clone
    }
    
}
