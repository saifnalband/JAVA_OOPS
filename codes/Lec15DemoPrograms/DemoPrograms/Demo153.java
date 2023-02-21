/* 
Author: Saif Nalband
Organization: DYPIU,Pune
Date: 14 Sep 2020
Summary: Classes and objects demostrations
        - initilaising trough method (passing the paramters)
        - Default initilisation 
        - method OVERLOADING
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
}
class Demo153{
    public static void main(String args[]){
        // default initilsation
        Point mypoint1 = new Point();
        mypoint1.setPoint();
        System.out.println("Object: 1 point x: " + mypoint1.x);
        System.out.println("Object: 1 point y: " + mypoint1.y);

        // paramter would be passed
        Point mypoint2 = new Point();
        mypoint2.setPoint(30, 40); // no hard coding of initilisation
        System.out.println("Object 2: point x: " + mypoint2.x);
        System.out.println("Object 2: point y: " + mypoint2.y);
    }
}