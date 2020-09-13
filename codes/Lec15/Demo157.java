/*
Author : Saif Nalband
Orgainization : DYPIU, Akurdi, Pune
Date: 13 Sep 2020
Summary: Simple program to domostrate classes & objects
objectives: 
    - overloading the contructors 
*/
class Circle{
    double xCordinate;
    double yCordinate;
    double radius;
    double PIE = 22/7;

    // methods
    double circumference(){
        return 2 * PIE * radius;
    }
    double area(){
        return PIE * radius * radius;
    }

    // contructors 
    Circle(double a, double b, double c){
        System.out.println(" Passing of three arguments");
        xCordinate = a;
        yCordinate = b;
        radius = c;
    }
    Circle( double c){
        System.out.println(" Passing only single argument");
        xCordinate = 0;
        yCordinate = 0;
        radius = c;
    }
    // pasing object as arguments
    Circle(Circle c){
        System.out.println(" Passing of object as arguments");
        xCordinate = c.xCordinate;
        yCordinate = c.yCordinate;
        radius = c.radius;
    }
    Circle(){
        System.out.println(" Default Contructors");
        xCordinate = 0;
        yCordinate = 0;
        radius = 50;
    }
}
class Demo157{
    public static void main(String args[]){
        Circle c1 = new Circle();
        System.out.println(" Circumference of c1 object: " + c1.circumference());
        System.out.println(" Area of c1 Object: " + c1.area());
        Circle c2 = new Circle(10);
        System.out.println(" Circumference of c2 object: " + c2.circumference());
        System.out.println(" Area of c2 Object: " + c2.area());
        Circle c3 = new Circle(2, 4, 20);
        System.out.println(" Circumference of c3 object: " + c3.circumference());
        System.out.println(" Area of c3 Object: " + c3.area());
        Circle c4 = new Circle(c3);
        System.out.println(" Circumference of c4 object: " + c4.circumference());
        System.out.println(" Area of c4 Object: " + c4.area()); 
    }
}