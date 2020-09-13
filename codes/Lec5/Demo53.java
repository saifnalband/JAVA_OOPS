// Demonstrate ++ and --.
class Test {
  public static void main(String[] args) {
    int u = 15; 
    int v = 20; 
    int w; 
    int x; 
    w = ++v;
    x = u++;
    w++;
    System.out.println("u = " + u);
    System.out.println("v = " + v);
    System.out.println("w = " + w);
    System.out.println("x = " + x);
  }
}