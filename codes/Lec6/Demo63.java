import java.util.Scanner;
public class Demo63 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();   
        scan.nextLine();           
        // gets rid of the pesky newline
        String s = scan.nextLine();
        scan.close();   
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}