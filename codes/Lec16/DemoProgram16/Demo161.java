/* 
Author: Saif Nalband
Organization: DYPIU,Pune
Date: 15 Sep 2020
Summary: Classes and objects demostrations
        - initilaising trough method (passing the paramters)
        - Default initilisation 
        - method OVERLOADING
        - contructors : Defualt
        - Constuctors: parameters : Contructor overloading
        - concept of keyword "this"

*/
class Point{
    int x;
    int y;

    // method
    void setPoint(){
        x = 10;
        y = 20;
        // default initisation
    }
    void setPoint(int a, int b){
        x = a;
        y = b;
    }
    Point(){
        System.out.println(" Default Contructors");
        x = 10;
        y = 10;
    }
    Point( int x, int y){
        System.out.println(" This is Parameterised Contructors");
        this.x = x;
        this.y = y;
    }
}
class Demo161{
    public static void main(String args[]){
        // default initilsation
        Point mypoint1 = new Point(); // mypoint.x = 10 and mypoint.y =10
        mypoint1.setPoint();
        System.out.println("Object: 1 point x: " + mypoint1.x);
        System.out.println("Object: 1 point y: " + mypoint1.y);

        // paramter would be passed
        Point mypoint2 = new Point();
        mypoint2.setPoint(30, 40); // no hard coding of initilisation
        System.out.println("Object 2: point x: " + mypoint2.x);
        System.out.println("Object 2: point y: " + mypoint2.y);

        Point mypoint3 = new Point();
        System.out.println("Object 3: point x: " + mypoint3.x);
        System.out.println("Object 3: point y: " + mypoint3.y);

        Point mypoint4 = new Point(100, 200);
        System.out.println("Object 4: point x: " + mypoint4.x);
        System.out.println("Object 4: point y: " + mypoint4.y);
    }
}