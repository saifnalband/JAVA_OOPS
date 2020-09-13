import java.util.Scanner;
public class Demo83 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        
        double positives = 0;
        double negatives = 0;
        double zeroes    = 0;
        for (int i = 0; i < size; i++) {
            int value = scan.nextInt();
            if (value > 0) {
                positives++;
            } else if (value < 0) {
                negatives++;
            } else {
                zeroes++;
            }
        }
        scan.close();
        
        System.out.format("%.6f",positives / size);
        System.out.format("%.6f",negatives / size);
        System.out.format("%.6f",zeroes    / size);
        System.out.println();
    }
}