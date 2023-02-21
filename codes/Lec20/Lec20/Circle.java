/*
Name : Saif Nalband
orgainization: DYPIU, Akurdi, Pune
Date : 23/09/2020
Summary: inner class
*/
class Circle{
    static double x, y, r;
    Circle(double r){
        this.r = r;
    }
    // folloing is the nested class
    public static class Point{
        double x,y;
        void display(){
            System.out.println("(x,y): (" + this.x + "," + this.y + ")");
        }
        Point(double a, double b){
            this.x = a;
            this.y = b;
        }
    }
    public boolean isInside(Point p){
        double dx = p.x - x;
        double dy = p.y - y;
        double distance = Math.sqrt((dx * dx) + (dy * dy));
        if(distance <r) return true;
        else return false;
    }
    public static void main(String args[]){
        Circle a = new Circle(5.0);
        Point pa = new Point(1.0, 2.0);
        pa.display();
        System.out.println(" is the point (1,2) inside the cicrle with radius:" + a.isInside(pa));
        Circle b = new Circle(1.0);
        Point pb = new Point(3.0, 3.0);
        pb.display();
        System.out.println(" is the point (3,3) inside the cicrle with radius:" + b.isInside(pb));
    }
}
