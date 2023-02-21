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
class Demo232{
    public static void main(String args[]){  
        Dog d = new Dog();  
    }
}  