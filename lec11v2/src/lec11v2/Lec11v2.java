
package lec11v2;

import java.util.StringTokenizer;

public class Lec11v2 {

    public static void main(String[] args) {
        
        // StringTokenizer : to separate String
        
        String s1 = "ali omar,ahmed,khalid";
        
        StringTokenizer st=new StringTokenizer(s1,","); // String , separator
        
        while(st.hasMoreTokens()){ // st.hasMoreTokens==true
            String token = st.nextToken();
            System.out.println("token: "+token);
        }
        
        // Wrapper class
        // from String to primitive
        
        String a1 = "a";
        char c = a1.charAt(0);
        int i=c;
        System.out.println(i);
        
        
        // from primitive to String
        int x = 574;
        String s = x + "";
        //OR
        String str = String.valueOf(x);
        
        //////////
        String s2 = "true";
        boolean b = Boolean.parseBoolean(s2);
        System.out.println(b);
        
    }
    
}
