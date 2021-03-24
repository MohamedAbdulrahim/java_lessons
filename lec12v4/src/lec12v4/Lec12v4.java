
package lec12v4;

import java.util.ArrayList;
import java.util.List;

public class Lec12v4 {

    
    // Collections deals only with objects
    
    public static void main(String[] args) {
        
        // Generics : means when i open Object from class i can store any data type in there
        
        // Generic classes most used in storing data
        
        /*
        DataStore ds = new DataStore();
        ds.setData("ali omar");
        Object ob = ds.getData();
        String s = (String)ob;
        */ // So java make solution they make generics
        
        DataStoreG<String> dss = new DataStoreG<>(); // if i didn't write <String> >> default is Object
        dss.setData("ahmed");
        String s = dss.getData();
        
        DataStoreG<Integer> dsi = new DataStoreG<>();
        dsi.setData(5);
        Integer st = dsi.getData();
        
        
        DataStoreDS dsds = new DataStoreDS();      
        int si = dsds.<Integer>m1(7);
        /*
     // raw type >> carry different dataType   
        List myList = new ArrayList();
        myList.add("ahmed");
        myList.add(12);
        myList.add(300.5);
        
        String st = (String) myList.get(0);
        Double du = (Double) myList.get(2);
        System.out.println(st);
        System.out.println(du);
        
        
        // Generic <Generic>  >> carry one dataType >> object
        
        List<String> myList2 = new ArrayList();
        
        myList2.add("moaz");
        myList2.add("mohamed");
        myList2.add(0, "karem"); 
        System.out.println(myList2);
        myList2.set(1, "hussien");// to modify
        System.out.println(myList2); 
        System.out.println(myList2.get(2));
        myList2.remove(1);
        System.out.println(myList2);
        System.out.println(myList2.contains("mohamed")); // to check
        
        //1
        System.out.println(myList2);
        
        //2
        for(int i=0;i<myList2.size();i++) // modify in myList2
            System.out.println(myList2.get(i));
        //OR
        myList2.forEach((element) -> {
            // for each element >> implementation on all index , doesn't modify in myList2
            System.out.println(element);
        });

        //OR
          for(String element:myList2) // for each element >> implementation on all index , doesn't modify in myList2
            System.out.println(element);

      
        myList2.clear(); // to delete all element
        System.out.println(myList2);
        
        
        List<Monitor> mon = new ArrayList<>();
        
        Monitor mon1 = new Monitor("hp", 13, "brown", 10);
        mon.add(mon1);
        //OR
        mon.add(new Monitor("lenove", 15, "purple", 5));
        
        System.out.println(mon);
        System.out.println(mon.contains(mon1));
        System.out.println(mon.contains(new Monitor("lenove", 15, "purple", 5)));
*/
    }
    
}
