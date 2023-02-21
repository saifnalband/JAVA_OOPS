package pack2;
import pack1.*;
class B{
    public static void main(String args[]){
        A obj = new A();
        System.out.println(obj.data);
        obj.msg();
    }
}