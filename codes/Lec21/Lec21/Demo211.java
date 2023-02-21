/*
Java String compareTo(): The Java String compareTo()
 method compares the given string with current string. 
 It is a method of ‘Comparable’ interface which is 
 implemented by String class. Don’t worry, we will be 
 learning about String interfaces later. It either returns 
 positive number, negative number or 0. 
*/
public class Demo211{ 
    public static void main(String args[]){ 
        String s1="hello";
        String s2="hello"; 
        String s3="hemlo"; 
        String s4="flag";
        System.out.println(s1.compareTo(s2)); // 0 because both are equal
        System.out.println(s1.compareTo(s3)); //-1 because "l" is only one time lower than "m" 
        System.out.println(s1.compareTo(s4)); // 2 because "h" is 2 times greater than "f"
    }
} 