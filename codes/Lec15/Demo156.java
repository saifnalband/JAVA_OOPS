/*
Author : Saif Nalband
Orgainization : DYPIU, Akurdi, Pune
Date: 13 Sep 2020
Summary: Simple program to domostrate classes & objects
objectives: 
    - initilising through method (hiding)
    - passing the arguments
    - overloading the method
    - contructors are method which are called when objects are created
    - overloading the contructors 
    - this keyward
*/
class Point{
    int x;
    int y;

    // method
    void setPoint(){
        x = 10;
        y = 20;
    }
    void setPoint(int a, int b){
        x = a;
        y = b;
    }
    Point(){
        System.out.println(" Deafult Contructor: is called when objects is created");
        x = 10;
        y = 10;
    }
    Point(int x, int y){
        System.out.println(" Parameterised Contructors: using this keyword");
        this.x = x;
        this.y = y;
    }
}
class Demo156 {
    public static void main(String args[]){
        Point mypoint = new Point();
        mypoint.setPoint(30, 40);

        System.out.println("object1 point x : " + mypoint.x);
        System.out.println("Object1 point y : " + mypoint.y);

        // creating new object for calling method without arguments
        Point mypoint1 = new Point();
        mypoint1.setPoint();
        System.out.println("object2 point x : " + mypoint1.x);
        System.out.println("Object2 point y : " + mypoint1.y);

        // creating object and initilising with default contructors
        Point mypoint2 = new Point();
        System.out.println(" assessing the x and y using mypoint2");
        System.out.println("object3 point x : " + mypoint2.x);
        System.out.println("Object3 point y : " + mypoint2.y);

        // creating object and initilising with parmetrised contructors : Contructor Overloading
        Point mypoint3 = new Point(50, 50);
        System.out.println("object3 point x : " + mypoint3.x);
        System.out.println("Object3 point y : " + mypoint3.y);
    }
}