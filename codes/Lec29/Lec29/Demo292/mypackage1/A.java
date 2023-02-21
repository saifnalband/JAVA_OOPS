package mypackage1;

public class A {
    public A() {
        X p = new X(); 
        System.out.println("same package constructor");
        System.out.println("n from A = " + p.n);
        // default is accessible within the same package
        //  class only
        //  System.out.println("n_pri = " + p.n_pri);
        System.out.println("n_pro from A = " + p.n_pro); 
        System.out.println("n_pub from A = " + p.n_pub);
    }
}