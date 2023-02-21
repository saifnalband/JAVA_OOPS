/*
Java String equals() : The Java String equals() 
method compares the two given strings on the 
basis of content of the string i.e Java String 
representation. If all the characters are 
matched, it returns true else it will return 
false
*/
public class Demo216{ 
    public static void main(String args[]){ 
        String s1="hello"; 
        String s2="hello"; 
        String s3="hi";
        System.out.println(s1.equals(s2));   // returns true
        System.out.println(s1.equals(s3));   // returns false
    }
}