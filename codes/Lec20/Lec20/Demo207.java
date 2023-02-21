import java.util.Scanner;;
class Demo207{
    public static void main( String args[]){
        System.out.print(" enter the radius: ");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double area = 3.14159 * radius * radius;
        System.out.println(" area is : " + area);
    }
}