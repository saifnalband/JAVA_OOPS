abstract class Bike{  
    abstract void run(); // declared 
    void repair(){
        System.out.println("reparing cost");
    }
}  
class KTM390 extends Bike{
    // void repair(){

    //}
    void run(){
        System.out.println("running safely");
    }
}
class RE extends Bike{
    void run(){
        System.out.println("lot of sound");
    }
}
class Demo261{
    public static void main(String args[]){  
        Bike obj = new KTM390();  //
        obj.run(); 
        Bike ob2 = new RE();
        ob2.run(); 
    }  
}