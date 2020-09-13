// Demonstrate several assignment operators.
class Demo52 {
    public static void main(String args[]) {
      int a = 1;
      int b = 2;
      int c = 3;
  
      a += 5; // a = a + 5;
      b *= 4; // b = b * 4;
      c += a * b; // c = c + (a * b);
      c %= 6;
      System.out.println("a = " + a);
      System.out.println("b = " + b);
      System.out.println("c = " + c);
    }
}