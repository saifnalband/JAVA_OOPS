class Circle {
	double x,y;
	double r;
	double circumference(){
	return 2*3.14159*r;
	}
	double area(){
	return (22/7)*r*r;
	}

}

class Box{
   double width;
   double height;
   double depth;
   double area(){
      double a;
       a = (width*height + height*depth + width*depth) * 2;
       return a;
   }
   double volume(){
       double v;
       v = width*height*depth;
       return v;
    }
}