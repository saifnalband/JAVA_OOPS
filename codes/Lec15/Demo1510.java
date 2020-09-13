/*
Author : Saif Nalband
Orgainization : DYPIU, Akurdi, Pune
Date: 13 Sep 2020
Summary: Simple program to domostrate classes & objects
objectives: 
    - this 
    - calling contructor within a contructors
*/
class A{
    A(){
        System.out.println("Hello A: default Constructor");
        this(10);
    }
    A(int x){
        System.out.println(" Paramterised Contructors");
        System.out.println(x);
    }
}
class Demo1510{
    public static void main(String args[]){
        A a = new A();
    }
}