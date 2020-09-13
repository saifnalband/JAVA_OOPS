class Circle{
    double x,y;
    double r;
    // methods
    double circumferences(){
        return 2* 3.14159 * r;
    }
    // mthods that return area
    double area(){
        return(22/7)* r * r;
    }
}
class Demo110{
    public static void main(String args[]){
        Circle c = new Circle();
        c.x = 0.0;
        c.y = 0.0;
        c.r = 5.0;
        System.out.println("Circumference " + c.circumferences());
        System.out.println("Area " + c.area());
    }
}