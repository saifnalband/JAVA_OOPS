/*
Java String contains() :The java string contains() 
method searches the sequence of characters in 
the string. If the sequences of characters are 
found, then it returns true otherwise returns 
false. 
*/
class ContainsExample{ 
    public static void main(String args[]){ 
        String name=" hello how are you doing"; 
        System.out.println(name.contains("how are you"));  // returns true
        System.out.println(name.contains("hello"));        // returns true  
        System.out.println(name.contains("fine"));         // returns false  
    }
}