
package lec13v3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Lec13v3 {

    public static void main(String[] args) {
        
        // Map Interface
            //  search is fast
        
        // when i make insert data in map >> i insert data like(key,value) , take key > hashFunction > index
        
        Map<Integer,String> m = new HashMap<>();   // <key,value>
        m.put(3,"ali mohamed");
        m.put(1,"khalid");
        String s = m.put(3,"mahmoud"); // replace and add old value in s
        System.out.println("old value : "+s);
        System.out.println("names : "+m);
        String s1= m.get(3);    
        System.out.println("s1 = "+s1);
        
        String s2= m.get(8); // if not exist given null
        System.out.println("s2 = "+s2);
        
        //iterator >> to get values
        // Map has association Set
        Set<Integer> si = m.keySet(); //si reference refer to Set ,, Set has keys of Map
        //For
        //OR
        Iterator<Integer> it = si.iterator();
        while(it.hasNext()){
            Integer k = it.next();
            String value = m.get(k);
            System.out.println("value : "+value);
        }
        
    }
    
}
