package pack1;
/* Example 1: protected modifier  */
public class Demo278A {
    protected int rollNo = 555;
    void msg(){ 
        // protected doesn't work
        System.out.println("Class A: Hello Java!" + rollNo);
    }
}