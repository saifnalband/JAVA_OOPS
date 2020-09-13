/*
author: Saif Nalband
organization : DY Patil International University, Akurdi, Pune
Summary: Demonstration of '+' as overload as in built 
user can not have operator overload
Date : 22 August 2020
*/
import java.util.Scanner;
public class Demo102{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of x");
        int x=in.nextInt();
        System.out.print(x + "+" + x + "=");
        System.out.println(x+x);
    }
}

/*
The + sign in java is "overloaded", which means that it 
has multiple meanings. 
In an arithmetic context -  when it's applied to numbers - it means "plus", as you would 
expect. 
In a String context - ie, when it's applied to two Strings 
- it means "concatenate", or "string together".
For what follows, it is important to distinguish between 
numbers - the quantities which we perform arithmetic on 
and can represent in various ways - from the String 
representations of those numbers.

In second expression System.out.println(x+x);, 
the plus sign means addition, since both of the arguments 
(x and x) are integers. Thus x+x evaluates to the integer 24. 
Then, since we're printing this to the standard output, 
we have to understand it as a String, so Java converts 
the number 24 into the String "24", and that is what is printed.
*/