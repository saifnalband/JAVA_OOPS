// A program that declares two objects of the Circle class
// Call this file

class Circle {
    double x, y;
	double r;
	double circumference(){
    	return 2*3.14159*r;
	}
	double area(){
	    return (22/7)*r*r;
    }
}
//The following class declares multiple objects of type Circle

class Demo111{
    public static void main(String args[]){
	    Circle c1 = new Circle();
	    Circle c2 = new Circle();
	    // Initialize the circles
	    c1.x = 3.0;
	    c1.y = 4.0;
	    c1.r = 5.0;
	    c2.x = -4.0;
	    c2.y = -8.0;
	    c2.r = 10.0;
	    System.out.println("Circumference Circle 1: " + c1.circumference());
	    System.out.println("Area Circle 1" + c1.area());
	    System.out.println("Circumference Circle 2:  " + c2.circumference());
	    System.out.println("Area Circle 2" + c2.area());
    }
}