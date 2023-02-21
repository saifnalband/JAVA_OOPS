package mypackage1;

public class Y extends X {
    public Y(){
        System.out.println("Contructor from SUB Class : Y");
        System.out.println("n = " + n);
        //  class only
        //  System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}