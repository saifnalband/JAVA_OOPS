/*
Author : Saif Nalband
Orgainization : DYPIU, Akurdi, Pune
Date: 13 Sep 2020
Summary: Simple program to domostrate classes & objects
objectives: 
    - overloading the contructors 
*/
class Demo158{
    public static void main(String args[]){
        Student s1 = new Student(111, "abc", "JAVA");
        Student s2 = new Student(112, "xyz", "JAVA", 6000);
        s1.display();
        s2.display();
    }
}