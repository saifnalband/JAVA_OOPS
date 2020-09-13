/*
Author : Saif Nalband
Orgainization : DYPIU, Akurdi, Pune
Date: 13 Sep 2020
Summary: Simple program to domostrate classes & objects
objectives: 
    - this 
*/
class A{
    void m(){
        System.out.println(" HELLO m");
    }
    void n(){
        System.out.println(" HELLO n");
        this.m(); // calling method m from n
    }
}
class Demo159{
    public static void main(String args[]){
        A a = new A();
        a.n();
    }
}