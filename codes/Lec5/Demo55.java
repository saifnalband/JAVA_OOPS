/*
This program multiples the number by 2
@author : Saif Nalband
@organization : DYPIU, Akurdi, Pune
*/
import java.util.Scanner;
public class Demo55 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        n = s.nextInt();
        int mul = n << 1;
        System.out.println("Answer:"+mul);
    }
}