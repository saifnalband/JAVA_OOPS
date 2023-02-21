// Dynamic Method Dispatch
class A {
   void callme() {
        System.out.println("Inside A's callme method");
    }
}

class B extends A {
    // override callme()
    void callme() {
        System.out.println("Inside B's callme method");
    }
}
class Demo244 {
    public static void main(String args[]) {
        A a = new B(); // upcasted 
        a.callme();
        B b = new B(); // object of type B
        b.callme();
    }
}