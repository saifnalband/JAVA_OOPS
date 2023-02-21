// A simple package
package MyPack;

public class Balance {
  public String name;
  public double bal;

  public Balance(String n, double b) {
    name = n;
    bal = b;
  }

  public void show() {
    if(bal<0) 
      System.out.print("-->> ");
    System.out.println(name + ": $" + bal);
  }
}