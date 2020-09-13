/*Demontration of constructor Overloading */
		
class Circle {
	double x,y;
	double r;
	Circle (double x, double y, double r){
	    this.x = x; this.y = y; this.r = r;
    }
    Circle (double r){
	    x = 0; y=0; this.r = r;
    }
    Circle (Circle c){
	    x = c.x; y = c.y; r = c.r;
    }
    Circle (){
	    x = 0.0; y = 0.0; r = 10.0;
    }
    double circumference(){
	    return 2*3.14159*r;
    }
    double area(){
	    return (22/7)*r*r;
    }
}

class Demo132{
    public static void main(String arge[]){
	    Circle c1 = new Circle(3.0,4.0,5.0);
	    Circle c2 = new Circle(5.0);
	    Circle c3 = new Circle(c1);
	    Circle c4 = new Circle();
	    System.out.println("Circumference Circle 1" + c1.circumference());
	    System.out.println("Area Circle 1" + c1.area());
	    System.out.println("Circumference Circle 2" + c2.circumference());
	    System.out.println("Area Circle 2" + c2.area());
	    System.out.println("Circumference Circle 3" + c3.circumference());
	    System.out.println("Area Circle 3" + c3.area());
	    System.out.println("Circumference Circle 4" + c4.circumference());
	    System.out.println("Area Circle 4" + c4.area());
    }
}