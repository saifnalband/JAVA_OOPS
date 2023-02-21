/*
Java String Trim() : The java string trim() 
method removes the leading and trailing spaces.
It checks the unicode value of space character 
(‘u0020’) before and after the string. 
If it exists, then removes the spaces and 
return the omitted string.
*/
public class StringTrimExample{  
    public static void main(String args[]){  
        String s1="  hello   ";  
        System.out.println(s1+"how are you");        // without trim()  
        System.out.println(s1.trim()+"how are you"); // with trim()  
    }
}