/*
@author: Saif Nalband
@organization : DY Patil International University, Akurdi, Pune
@Summary: to convert letter from lowercase to UPPERCASE 
and vice versa
@Date : 22 August 2020
*/
public class Demo104 {
    public static void printLowerCase(String a){
        String b = "";
        System.out.println(" In Hand crafted Function to convert into lower case");
        for(char ch: a.toCharArray()) { // to count each character in a given string
            if(ch >= 'A' && ch <= 'Z')
                ch += 32;
        // System.out.print(ch);
        b += ch ; // string concatenation
        }
        System.out.println(" in Lowerase " + b);
    }
    public static void printHigerCase(String a){
        String b = "";
        System.out.println(" In Hand crafted Function to convert into upper case");
        for(char ch: a.toCharArray()) {
            if(ch >= 'a' && ch <= 'z')
                ch -= 32; // converting to UPPERCASE
        // System.out.print(ch);
        b += ch ; // string concatenation
        }
        System.out.println(" in UpperCase " + b);
    }    
    public static void main(String[] args) {    
            
        String str1="Great Power";  
        //String str3 = str1;  
        StringBuffer newStr=new StringBuffer(str1);
        printLowerCase(str1);
        printHigerCase(str1);    
            
        for(int i = 0; i < str1.length(); i++) {    
                
            //Checks for lower case character    
            if(Character.isLowerCase(str1.charAt(i))) {    
                //Convert it into upper case using toUpperCase() function    
                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));    
            }    
            //Checks for upper case character    
            else if(Character.isUpperCase(str1.charAt(i))) {    
                //Convert it into upper case using toLowerCase() function    
                newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));    
            }    
        }    
        System.out.println("String after case conversion : " + newStr);    
    }    
}