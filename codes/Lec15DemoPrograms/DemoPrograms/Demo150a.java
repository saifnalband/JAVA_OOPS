/* 
Author: Saif Nalband
Organization: DYPIU,Pune
Date: 14 Sep 2020
Summary: Classes and objects demostrations
        - getting square root of number
*/
import java.lang.*;

class Calculator{
    double i;
    double getSqrt(double a){
        return Math.sqrt(a);
    }
}
class Demo150a{
    public static void main(String args[]){
        Calculator cal = new Calculator();
        cal.i = 100;
        System.out.println(" Square Root of " + cal.i + "is " + cal.getSqrt(cal.i));
    }
}