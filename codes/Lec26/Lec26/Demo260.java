/*
Author : Saif Nalband
Date : 07/10/ 2020
Summary : Member Access and Inheritance 
*/
/* In a class hierarchy, private members remain
   private to their class.

   This program contains an error and will not
   compile.
*/

// Create a superclass.
class A {
    int i; // public be default
    private int j; // private to A
  
    void setij(int x, int y) {
      i = x;
      j = y;
    }
}
  
  // A's j is not accessible here.
class B extends A {
    int total;
  
    void sum() {
      total = i + j; // ERROR, j is not accessible here
    }
}
    
class Demo260 {
    public static void main(String args[]) {
      B subOb = new B(); // object of subclass
  
      subOb.setij(10, 12);
  
      subOb.sum();
      System.out.println("Total is " + subOb.total);
    }
}