import java.util.*;
import java.io.*;

class Demo67{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt(); // given  a value
            int b = in.nextInt(); // given b value
            int n = in.nextInt(); // number of irtration
            for( int j = 0; j < n; j++){
                a += b * (int)Math.pow(2, j);
                System.out.print(a + " ");
            }
            System.out.println();
        }
        in.close();
    }
}