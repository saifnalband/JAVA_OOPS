/*
@author : Saif Nalband
Simple Types are passed by value.
*/

class Test {
    void meth(int i, int j) {
      i *= 2;
      j /= 2;
      System.out.println(" ------- in method ----------");
      System.out.println("value of i(a):  " + i);
      System.out.println("value of j(b):  " + j);
      System.out.println(" ---------------------------");
    }
  }
  
class Demo172 {
    public static void main(String args[]) {
      Test ob = new Test();
      int a = 15, b = 20;
      
      System.out.println("a and b before call: " + a + " " + b);
  
      ob.meth(a, b); 
  
      System.out.println("a and b after call: " + a + " " + b);
    }
}