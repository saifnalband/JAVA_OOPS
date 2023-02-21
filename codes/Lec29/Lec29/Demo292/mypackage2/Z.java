package mypackage2 ;
import mypackage1.*;

public class Z extends mypackage1.X {
    public Z() {
        System.out.println("derived other package constructor");
        //  class or package only
        //  System.out.println("n = " + n);

        //  class only
        //  System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}