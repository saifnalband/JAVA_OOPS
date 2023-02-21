/*
an example of throw 
customise expection
*/
import java.lang.Exception;
class MyException extends   Exception {
    MyException (String message){
        super(message);
    }
}
class Demo3310{
    public static void main(String[] args) {
        int x = 5; 
        int y = 1000;
        try {
            float z = (float) x / (float) y;
            if (z < 0.01) throw new MyException(" Given data  are not proper"); 
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println(" It will always be printed");
        }
        
    }
}