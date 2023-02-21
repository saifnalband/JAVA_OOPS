import myShape.*;
public class GeoDemo{
    public static void main(String args[]){
        Geometry [] geoObjects = new Geometry[3];
        // create an array to hold Geometery objects
        geoObjects[0] = new Circle(2.0);
        geoObjects[1] = new Rectangle(1.0, 3.0);
        geoObjects[2] = new Ellipse(4.0, 2.0);
        double totalArea = 0;
        for(int i = 0; i < 3; i++){
            totalArea = totalArea + geoObjects[i].area();
        }
        System.out.println(" Total Area = " + totalArea);
    }
}