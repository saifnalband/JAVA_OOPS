public class A{
    protected void msg(){
        System.out.println("Class A: Hello JAVA!!!")
    }
}

public class Demo2711 extends A{
    protected void msg(){
        System.out.println("Class B: Welcome!!!")
    } 
    public static void main(String args[]){
        Demo2711 obj = new Demo2711();
        obj.msg();
    }
}