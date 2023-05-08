/*
Invoking parent class method
*/
class Animal{  
    void eat(){System.out.println("eating...");}  
    }  
class Dog extends Animal{  
    void eat(){
        super.eat();
        System.out.println("eating bread...");
    }  
    void bark(){
        System.out.println("barking...");
    }  
    void work(){  
        //super.eat();  
        bark();  
    }  
}
class GermanShepard extends Dog{
    void eat(){
        super.eat();
        System.out.println(" loyal ");
    }
}  
class Demo231{  
    public static void main(String args[]){  
        Dog d = new Dog();  
        d.work();
        GermanShepard gs = new GermanShepard();
        gs.eat();
        Animal al = new Animal();
        al.eat();  
    }
}