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
}
class Demo114 {
    public static void main(String[] args){
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        // Initilise the circle
        c1.setCircle(1.0, 4.0, 5.0);
        c2.setCircle(3.0, 4.0, 15.0);
        System.out.println("Circumference Circle 1" + c1.circumference());
    	System.out.println("Area Circle 1" + c1.area());
    	System.out.println("Circumference Circle 2" + c2.circumference());
    	System.out.println("Area Circle 2" + c2.area());
    }
}