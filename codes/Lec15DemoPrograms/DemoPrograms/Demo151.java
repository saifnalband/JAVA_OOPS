/* 
Author: Saif Nalband
Organization: DYPIU,Pune
Date: 14 Sep 2020
Summary: Classes and objects demostrations
        - initilaising trough method
*/
class Point{
    int x;
    int y;

    // method
    void setPoint(){
        x = 10;
        y = 20;
    }
}
class Demo151{
    public static void main(String args[]){
        Point mypoint = new Point();
        mypoint.setPoint(); // no hard coding of initilisation
        System.out.println("point x: " + mypoint.x);
        System.out.println("point y: " + mypoint.y);
    }
}