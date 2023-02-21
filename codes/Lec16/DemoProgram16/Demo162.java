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
        - passing Object as argument : Contructor Overlaoding
*/
class Circle{
    double xCordinate;
    double yCordinate;
    double radius;
    double PIE = 22/7;

    // methods
    double area(){
        return PIE * radius * radius;
    }
    double circumfernces(){
        return 2 * PIE * radius;
    }
    
    // default Constructors
    Circle(){
        System.out.println(" Deafult Constructor Invoked");
        xCordinate = 0;
        yCordinate = 0;
        radius = 5;
    }
    Circle(double xCordinate, double yCordinate, double radius){
        this.xCordinate = xCordinate;
        this.yCordinate = yCordinate;
        this.radius = radius;
    }
    Circle(double c){
        xCordinate = 5;
        yCordinate = 5;
        radius = c;
    }
    // Objects passed as paramters
    Circle(Circle c){
        xCordinate = c.xCordinate;
        yCordinate = c.yCordinate;
        radius = c.radius;
    }
}
class Demo162{
    public static void main(String args[]){
        Circle c1 = new Circle();
        System.out.println(" Circumferences of C1: " + c1.circumfernces());
        System.out.println(" Area of C1: " + c1.area());

        Circle c2 = new Circle(10);
        System.out.println(" Circumferences of C2: " + c2.circumfernces());
        System.out.println(" Area of C2: " + c2.area());

        Circle c3 = new Circle( 100, 100, 50);
        System.out.println(" Circumferences of C3: " + c3.circumfernces());
        System.out.println(" Area of C3: " + c3.area());

        Circle c4 = new Circle(c3);
        System.out.println(" Circumferences of C4: " + c4.circumfernces());
        System.out.println(" Aread of C4: " + c4.area());
    }
}