import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;

public class Demo85 {
    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        int size = arr.length; // size of the array
        int[] sumResult = new int[size];
        int sumtemp;
        for (int j = 0; j < size; j++){
            sumtemp = 0;
            for(int i = 0; i < size; i++){
                if (i==j){
                    continue;
                }
                else{
                    sumtemp += arr[i];
                }
            }
            sumResult[j] = sumtemp; 
        }
        int max = Arrays.stream(sumResult).max().getAsInt();
        int min = Arrays.stream(sumResult).min().getAsInt();
        System.out.println("Largest in given array is " +max);
        System.out.println("Smallest in given array is " +min);
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[5];
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        miniMaxSum(arr);

        scanner.close();
    }
}
