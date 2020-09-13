// Left shifting a byte value.
class Demo56 {
    public static void main(String args[]) {
      byte a = 64, b;
      int i;
  
      i = a << 2; // Java automatic converstion from byte to int 
      b = (byte) (a << 2); // because of overflow
  
      System.out.println("Original value of a: " + a);
      System.out.println("i and b: " + i + " " + b);
    }
}