/* Example on the multiple inheritance with interface.
Case 2:  Example of "extends" with "implements"
*/

class A {
    protected int j = 1000;
    void print() { 
        System.out.println("I am from A "+j);
    }
}

interface I {
    public static int i = 555;
    void printInterface();
}

class B extends A implements I{
     public int aValue = 999;
     
     public void printInterface() {
          System.out.println("I am from I " + i);
     }
     public void printB() {
         super.print();
         printInterface();
    }
}


//Driver code in main class
public class Demo304 { 
        public static void main (String[] args)     { 
			  B b = new B(); 
			  b.printB(); 
    } 
}