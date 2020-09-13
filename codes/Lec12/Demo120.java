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
	Circle (){
		System.out.println("Constructing Circle: Default");
	    x = 0.0; y = 0.0; r = 15.0;
    }
	Circle(double a, double b, double c){
		System.out.println(" Parameterized Constructors!!");
		x = a; // Set center x-coordinate
		y = b; // Set center y-coordinate
		r = c; // Set radius
	}
}
class Demo120{
    public static void main(String args[]){
    	Circle c1 = new Circle(3.0,4.0,5.0);
    	Circle c2 = new Circle(-4.0,8.0,10.0);
    	Circle c3 = new Circle();
    	System.out.println("Circumference Circle 1" + c1.circumference());
    	System.out.println("Area Circle 1" + c1.area());
    	System.out.println("Circumference Circle 2" + c2.circumference());
		System.out.println("Area Circle 2" + c2.area());
		System.out.println("Default Circumference Circle 3" + c3.circumference());
    	System.out.println("Default Area Circle 3" + c3.area());
    }
}