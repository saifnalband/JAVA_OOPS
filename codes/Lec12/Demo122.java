// A Java program to demonstrate working of constructor in Java with muiltiple class 

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
class Box {
    double width;
    double height;
    double depth;
  
    // This is the constructor for Box.
    Box() {
      System.out.println("Constructing Box");
      width = 10;
      height = 10;
      depth = 10;
    }
  
    // compute and return volume
    double volume() {
      return width * height * depth;
    }
  }
class Demo122{
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

        System.out.println("---------------------------------------");
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        System.out.println("Depth of mybox" + mybox1.depth);
        System.out.println("Height of mybox" + mybox2.height);
        double vol;
        // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);
  
        // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}
