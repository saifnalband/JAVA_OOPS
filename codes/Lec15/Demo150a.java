/*
Author : Saif Nalband
Orgainization : DYPIU, Akurdi, Pune
Date: 13 Sep 2020
Summary: Simple program to domostrate classes & objects
*/
import java.lang.*;

class Calculator{
    double i ;
    double getSqrt(double a){
        return Math.sqrt(i);
    }
}
class Demo150a{
    public static void main(String args[]){
        Calculator cal = new Calculator();
        cal.i = 25;
        System.out.println("Square root of " +cal.i+ " is "+cal.getSqrt(cal.i));
    }
}