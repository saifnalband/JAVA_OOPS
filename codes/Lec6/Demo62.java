import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Demo62 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        //System.out.println((N%2==1 || (N>=6 && N<=20)) ? "Weird" : "Not Weird");
        if(N%2==1 || (N>=6 && N <= 20)){
            System.out.println("Weird");
        }else{
            System.out.println("Not Weird");
        }
        scanner.close();
    }
}

/*
if(n%2==1 || (n>=6 && n <= 20)){
  System.out.println("Weird");
}else{
  System.out.println("NOt Weird");
}
*/