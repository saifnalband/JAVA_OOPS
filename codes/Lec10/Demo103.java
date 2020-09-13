/*
author: Saif Nalband
organization : DY Patil International University, Akurdi, Pune
Summary: Demostration of string by removing whitespaces
Date : 22 August 2020
*/
public class Demo103 {    
    public static void main(String[] args) {    
        String str1="This Program will remove white spaces"; 
        String str2 = "";   
        //Removes the white spaces using regex    
        str2 = str1.replaceAll("\\s+", "");    
        System.out.println("String Before removing all the white spaces : " + str1);    
        System.out.println("String after removing all the white spaces : " + str2);    
    }    
}  