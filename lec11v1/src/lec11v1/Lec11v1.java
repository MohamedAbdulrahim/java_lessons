
package lec11v1;

public class Lec11v1 {

    public static void main(String[] args) {
        
        
        // String >> immutable
        String s1="ali";
        s1="Omar";
        // immutable means >>
        // can't change in content in memory , String open another place (open another object) and refer to it
        // & the first object(ali) by Garbage Collection is removed because no refernce refer to it 
        
        for(int i=0;i<4;i++){
            s1=s1+","+i;
        } // so more Objects open in memory ,,, waste memory capacity
        // so we make StringBuilder or StringBuffer >> for modification >> to doesn't open more objects in memory
        
        
        // StringBuffer like StringBuilder except:
        StringBuffer sb=null;   // synchronized
        StringBuilder sbb=null; // non-synchronized
        // so if i use this classes i modify in the same object of StringBuilder or StringBuffer
        
       
        // StringBuilder , StringBuffer >> mutable
        String name = "ahmed ali";
        StringBuilder builder = new StringBuilder(name); // StringBuilder or StringBuffer >> to modify String
        builder.append(" mohamed"); // add to end
        System.out.println(builder);
        
        // so if i end modification
            s1=builder.toString();
            System.out.println("s1 = "+s1); 
     
        builder.delete(2, 4);
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);
        // separate String to Tokens like by , or any thing is called Tokenizer class
        
        // store number by String class and need to convert to Number class is called conversion ViseVersa
                                                    // means from primitive to reference or reference to primitive
                                                    
                                                    
        
    }
    
}
