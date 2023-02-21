abstract class Bike{  
    abstract void run();  
}  
class KTM390 extends Bike{
    void run(){
        System.out.println("running safely");
    }
}
class Demo261{
    public static void main(String args[]){  
        Bike obj = new KTM390();  
        obj.run();  
    }  
}