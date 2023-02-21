interface GeoAnalyzer{
    final static float PI = 3.142F;
    float area();
    float perimeter();
}

class Circle implements GeoAnalyzer{
    float radius;
    Circle(float r){
        radius = r;
    }
    public float area(){
        return (PI * radius * radius);
    }
    public float perimeter(){
        return (2 * PI * radius);
    }
}

class Ellipse implements GeoAnalyzer{
    float major;
    float minor;
    Ellipse(float m, float n){
        major = m;
        minor = n;
    }
    public float area(){
        return (PI * major * minor);
    }
    public float perimeter(){
        return (PI * (major + minor));
    }
}

class Rectangle implements GeoAnalyzer{
    float length;
    float width;
    Rectangle(float l, float w){
        length = l;
        width = w;
    }
    public float area(){
        return (length * width);
    }
    public float perimeter(){
        return(2 * (length + width));
    }
}
class Demo301{
    static void display(float x, float y){
        System.out.println(" Area = " + x + "Perimeter = " + y);
    }
    public static void main(String args[]){
        Circle c = new Circle(5.2F);
        Ellipse e = new Ellipse(4.5F, 3.6F);
        Rectangle r = new Rectangle(6.5F, 4.3F);
        GeoAnalyzer geoItem;
        geoItem = c;
        display(geoItem.area(), geoItem.perimeter());
        geoItem = e;
        display(geoItem.area(), geoItem.perimeter());
        geoItem = r;
        display(geoItem.area(), geoItem.perimeter());
    }
}
