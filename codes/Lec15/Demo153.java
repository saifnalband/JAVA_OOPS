/*
Author : Saif Nalband
Orgainization : DYPIU, Akurdi, Pune
Date: 13 Sep 2020
Summary: Simple program to domostrate classes & objects: 
    - initilising through method (hiding)
    - passing the arguments
    - overloading the method
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
}
class Demo153 {
    public static void main(String args[]){
        Point mypoint = new Point();
        mypoint.setPoint(30, 40);

        System.out.println("object1 point x : " + mypoint.x);
        System.out.println("Object1 point y : " + mypoint.y);

        // creating new object
        Point mypoint1 = new Point();
        mypoint1.setPoint();
        System.out.println("object2 point x : " + mypoint1.x);
        System.out.println("Object2 point y : " + mypoint1.y);
    }
}