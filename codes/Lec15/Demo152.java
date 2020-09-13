/*
Author : Saif Nalband
Orgainization : DYPIU, Akurdi, Pune
Date: 13 Sep 2020
Summary: Simple program to domostrate classes & objects: 
    - initilising through method (hiding)
    - passing the arguments
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
class Demo152 {
    public static void main(String args[]){
        Point mypoint = new Point();
        // coding coding in main programs
        //mypoint.x = 10;
        // mypoint.y = 20;
        mypoint.setPoint(10, 20);

        System.out.println("point x : " + mypoint.x);
        System.out.println("point y : " + mypoint.y);
    }
}