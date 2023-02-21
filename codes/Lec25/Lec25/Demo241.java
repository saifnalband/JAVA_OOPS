/*
Name: Saif Nalband
Organization: DYPIU, Akurdi, Pune
Date : 3 October 2020
Summary : Simple example of inhertance 
*/
class Point2D{
    double x, y;
    Point2D(){
        // default Contstructor Initliaization
        x = 0.0;
        y = 0.0;
    }
    Point2D( double x, double y){
        this.x = x;
        this.y = y;
    }
    void display(){
        System.out.println("x = " + x + " y = " + y);
    }
}
class Point3D extends Point2D{
    double z;
    Point3D(){
        super();
        z = 0.0;
    }
    Point3D(double x, double y, double r){
        super(x, y);
        this.z = z;
    }
    void display(){
        System.out.println("x = " + x + " y = " + y + " z: " + z);
    }
}

class Demo241{
    public static void main(String args[]){
        Point2D p1 = new Point2D();
        System.out.println("Point 2D is for object p1 : ");
        p1.display();

        Point2D p2 = new Point2D();
        p2.x = 10;
        p2.y = 20;
        System.out.println("Point 2D is for Object p2 : ");
        p2.display();

        Point3D p3 = new Point3D(10.0,10.0,7.0);
        System.out.println("Point 3D id for Object p3: ");
        p3.display();

        Point3D p4 = new Point3D();
        p4.x = 30;
        p4.y = 40;
        p4.z = 50;
        System.out.println("Point 3D is for Object p4 : ");
        p4.display();
    }
}