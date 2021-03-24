package lec6v2;

public class Lec6v2 {

    public static void main(String[] args) {
        // String class
        
        // String >> Constructors , Literals , Concatenate
        
        // Constructors ,every reference refer to another object
        
        String name = new String ();
        
        String name2 = new String("ahmed ahmed");
        String name3 = new String("ahmed ahmed");
        // name2 refer to one object , name3 refer to another object
        System.out.println(name);
        
        
        
        System.out.println("length = "+name2.length());
        System.out.println("name UpperCase : "+name2.toUpperCase());
        System.out.println("name LowerCase : "+name2.toLowerCase());
        System.out.println("name substring : "+name2.substring(1,3));
        System.out.println("name substring : "+name2.substring(3));
        System.out.println("name CharAt : "+name2.charAt(4));
        System.out.println("name CharAt : "+name2.charAt(name2.length()-1));
        System.out.println("name indexof"+ name2.indexOf("a"));
        System.out.println("name indexOf"+ name2.indexOf("y")); // if not exit return -1
        System.out.println("name lastIndexOf"+ name2.lastIndexOf("a"));
        System.out.println("name IndexOf"+ name2.indexOf("a",3)); // start search from index 3
        
        
        
        // how many spaces in text
        
        int count=0;
        for (int i = 0; i < name.length()-1; i++) {
            char c = name2.charAt(i);
            if(c==' ')
                count++;
        }
        System.out.println("Spaces = "+count);
        //   the range between capital&small liter is 32 to make upper litters and lower litters
        
        
        
        
        // index start from zero
        // Literals 
        String name4 = "Mona"; // a special class
        /*
        pool : put literals variables in pool , if namea = "ahmed" , nameb = "ahmed" , namex = "Mona"
               namea , nameb refer to one object , namex refer to another object 
        */
        
        // Concatenate
        String firstName = "ali";
        String lastName = "mohamed";
        String fullName = firstName+" "+lastName;
        System.out.println(fullName);
        
        //////////
        
        String names = "nono";
        names = "karim";
        System.out.println(names);
        
        ////////
        
        String name5 = "hussien";
        System.out.println(name5.length());
        System.out.println(name5.startsWith("ha"));
        System.out.println(name5.startsWith("s", 2));
        System.out.println(name5.endsWith("sien"));
        System.out.println(name5.contains("si"));
        System.out.println(name5.isEmpty());
        System.out.println(name5.indexOf("i"));
        System.out.println(name5.indexOf("us"));
        System.out.println(name5.indexOf("a")); // return negative num means "a" Not found
        System.out.println(name5.charAt(1));
       // System.out.println(name5.charAt(9)); // given error because length of name5 is 7s
        System.out.println(name5.substring(3)); // remove chars before index 3 , index 3 not remove
        System.out.println(name5.subSequence(4, 6)); //remove chars before index 3,index 3 not remove, index 6 is remove
        
        /////////
        
        String email = "mohamed@gmail.com";
        int index = email.indexOf("@");
        String namee = email.substring(0, index);
        System.out.println("Welcome "+namee);
        
        /////////
        
        String newName = name5.toUpperCase();// to make upper object
        System.out.println(newName);      
        System.out.println(name5.toLowerCase());
        
        ///////////
        
        String stud1 = new String("ahmed");
        String stud2 = new String("ahmed");
        String stud3 = new String("AhMeD");
        
        System.out.println(stud1==stud2); // compare hashcode
        System.out.println(stud1.equals(stud2)); // compare object values
        System.out.println(stud1.equalsIgnoreCase(stud3)); // compare object values 
        
        String s4="amr ";
        String s5="amr";
        System.out.println(s4==s5); // because String in pool 
        System.out.println(s4.equals(s5));
        
        System.out.println("matches "+s4.matches(s5));
        
        ///////////
        
        // convert primitive to String
        int x =7;
        
        String num1 = x+"";
        // OR
        String num2 = String.valueOf(x);
        
        System.out.println(num1+num2);
        
        /*
        String is Immutable >> can't modify
                            >> means it can make another object in memory catch with same reference (names)    
*/     
        
        // Formated Output
           // Printf
        /*
        String name = "Yassien";
        int age = 5;
        char c = 'Y';
        
        System.out.printf("His name is %s and his age is %d%nand his char starts with %c",name,age,c);
        */
        // format specifier
        /*
            String %s
            Integers %d
            Charcater %c
            Floating-Point %f
            Boolean %b
            NewLine %n \n
        */
        /*
        double price= 3.944;
        System.out.printf("price is %.1f",price);   //  for almost 3.944 >> .1f  >> 3.9
        */
    }
    
}
