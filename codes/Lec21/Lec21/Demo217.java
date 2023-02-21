/*
Java String replace(): The Java String replace()
method returns a string, replacing all the old 
characters or CharSequence to new characters. 
There are 2 ways to replace methods in a Java 
String. 
*/
public class Demo217{
    public static void main(String args[]){ 
        String s1 = "hello how are you"; 
        String replaceString = s1.replace('h','t'); 
        System.out.println(replaceString); 
        String s2 ="Hey, welcome to DYP"; 
        String replaceString1 = s2.replace("DYP","DYPIU, Akurdi, Pune"); 
        System.out.println(replaceString1);
    }
}