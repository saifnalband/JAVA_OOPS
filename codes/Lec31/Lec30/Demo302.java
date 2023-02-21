/* An interface acts like a class. 
That is, we can do everything as we do with class 
except the object instantiation. Here, is an example on 
the single inheritance with interface.
*/
interface I1 {
    double x = 4.444;
	void methodI1(); //public static by default
}

interface I2 extends I1 {
    double y = 5.555;
	void methodI2(); //public static by default
}


class A1 implements I2 {
       public int a1 = 555;
	   
       public void methodI1(){
           System.out.println("From I1"+x+y);
       }
       public void methodI2(){
          System.out.println("From I2"+x+y); 
      }
}   
	

public class Demo302 {
	public static void main(String[] args) {
	  A1 a = new A1();
	  a.methodI1();
	  a.methodI2();
     }
}
