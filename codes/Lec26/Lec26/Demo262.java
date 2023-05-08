// A Simple demonstration of abstract.
abstract class A {
  abstract void callme(); // declare

  // concrete methods are still allowed in abstract classes
  void callmetoo() {
    System.out.println("This is a concrete method.");
  }
}

class B extends A {
  // void callmetoo()
  void callme() { // define
    System.out.println("B's implementation of callme.");
  }
}

class Demo262 {
  public static void main(String args[]) {
    B b = new B();

    b.callme();
    b.callmetoo();
  }
}