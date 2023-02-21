import java.util.Scanner;

class Demo206{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        // calculating the max two numbers in JAVA
        System.out.println("please enter two numbers to find max of two");
        int a = sn.nextInt();
        int b = sn.nextInt();
        if(a > b){
            System.out.printf("Between %d and %d , maximum is %d\n",a, b, a);
        }
        else {
            System.out.printf("Between %d and %d , maximum is %d\n",a, b, b);
        }
    }
}