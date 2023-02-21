// A Java program to demonstrate working of constructor in Java 

class Circle {
	double x,y;
	double r;
	double circumference(){
		return 2*3.14159*r;
	}
	double area(){
		return (22/7)*r*r;
	}
	
    void setCircle(double a, double b, double c){
	    x = a; // Set center x-coordinate
	    y = b; // Set center y-coordinate
	    r = c; // Set radius
	}
	Circle(){
		System.out.println("Constructotrs: Defaults");
		x = 0;
		y = 0;
		r = 50;
	}
    Circle(double x, double y, double r){
		System.out.println("Paramterizted Contructors");
		this.x = x; // Set center x-coordinate
		this.y = y; // Set center y-coordinate
		this.r = r; // Set radius
    }
}
class Demo131{
    public static void main(String args[]){
    	Circle c2 = new Circle(-4.0,8.0,10.0);
    	System.out.println("Circumference Circle 2: " + c2.circumference());
		System.out.println("Area Circle 2" + c2.area());
    	// changing again by calling method : But this is very tedious way
        c2.setCircle(1.0,1.0, 5);
        c2.setCircle(10,10,30);
        System.out.println("Circumference Circle 2: " + c2.circumference());
		System.out.println("Area Circle 2" + c2.area());
		// Creating object of default constructors
		Circle c3 = new Circle();
		// c3.setCircle(1.0,1.0, 15);
        System.out.println("Circumference Circle 3: " + c3.circumference());
        System.out.println("Area Circle 3" + c3.area());
    }
}