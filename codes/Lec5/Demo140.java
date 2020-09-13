public class Test 
{ 
    public int getData() //getdata() 1 
    { 
        return 0; 
    } 
    public long getData() //getdata 2 
    { 
        return 1; 
    } 
    public static void main(String[] args) 
    { 
        Test obj = new Test(); 
        System.out.println(obj.getData());     
    } 
}