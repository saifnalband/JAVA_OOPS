/*
Name : Saif Nalband
Organization : DYPIU, Aurkdi, Pune
Date : 16 September 2020
Summary: Example of refering object to another
*/
class Circle{
    double xCordinate;
    double yCordinate;
    double radius;
}
class Demo175{
    public static void main(String args[]){
        Circle c1 = new Circle();
        Circle c2 = c1;
        c1.radius = 200;
        c2.radius = 400;
        System.out.println(" C1 radius: " + c1.radius);
        System.out.println(" C2 radius: " + c2.radius);
    }
}