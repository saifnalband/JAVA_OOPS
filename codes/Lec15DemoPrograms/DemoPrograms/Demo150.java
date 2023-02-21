/* 
Author: Saif Nalband
Organization: DYPIU,Pune
Date: 14 Sep 2020
Summary: Classes and objects demostrations
*/
class Point{
    int x;
    int y;
}
class Demo150{
    public static void main(String args[]){
        Point mypoint = new Point();
        mypoint.x = 10;
        mypoint.y = 20;

        System.out.println("point x: " + mypoint.x);
        System.out.println("point y: " + mypoint.y);
    }
}