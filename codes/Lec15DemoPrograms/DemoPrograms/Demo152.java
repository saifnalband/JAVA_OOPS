/* 
Author: Saif Nalband
Organization: DYPIU,Pune
Date: 14 Sep 2020
Summary: Classes and objects demostrations
        - initilaising trough method (passing the paramters)
*/
class Point{
    int x;
    int y;

    // method
    void setPoint(int a, int b){
        x = a;
        y = b;
    }
}
class Demo152{
    public static void main(String args[]){
        Point mypoint = new Point();
        mypoint.setPoint(30, 40); // no hard coding of initilisation
        System.out.println("point x: " + mypoint.x);
        System.out.println("point y: " + mypoint.y);
    }
}