class Bike{
    void run(){
        System.out.println("Running");
    }
}
class RoyalEnfield extends Bike{
    void run(){
        System.out.println("Hug Hug Hug....");
    }
}
class Demo243{
    public static void main(String args[]){
        RoyalEnfield class500cc = new RoyalEnfield();
        class500cc.run();
        Bike hero = new Bike();
        hero.run();
        Bike modified = new RoyalEnfield(); // upcasting
        modified.run();
    }
}