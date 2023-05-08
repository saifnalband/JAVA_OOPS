/*

*/
class Animal{  
    Animal(){
        System.out.println("Animal contructors is created");
    }  
}  
class Dog extends Animal{ 
    Dog(){  
        // super();  
        System.out.println("dog is created");  
    }  
}
class GermanShepard extends Dog{
    GermanShepard(){
        System.out.println(" GermanShepard is created");
    }
    void eat(){
        System.out.println(" eating very well");
    }
    //eat();
}  
class Demo232{
    public static void main(String args[]){  
        //Dog d = new Dog();  
        GermanShepard gs = new GermanShepard();
        gs.eat();
        eat();
    }
}  