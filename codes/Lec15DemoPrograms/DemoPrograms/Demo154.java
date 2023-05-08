/* 
Author: Saif Nalband
Organization: DYPIU,Pune
Date: 14 Sep 2020
Summary: Classes and objects demostrations
        - initilaising trough method (passing the paramters)
        - Default initilisation 
        - method OVERLOADING
        - contructors :
*/
class Point{
    int x;
    int y;

    // method
    void setPoint(){
        x = 100;
        y = 200;
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
    Point(int a, int b){
        x = a;
        y = b;
        System.out.println(" paramtersised Contructors");
    }
}
class Demo154{
    public static void main(String args[]){
        // default initilsation
        Point mypoint1 = new Point();
        System.out.println(" Before calling mypoint1.setPoint();");
        System.out.println("Object: 1 point x: " + mypoint1.x);
        System.out.println("Object: 1 point y: " + mypoint1.y);
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
    }
}