public class Employee {  
    int id;  
    String name;  
    Address address;  
      
    public Employee(int id, String name,Address address) {  
        this.id = id;  
        this.name = name;  
        this.address=address;  
    }  
      
    void display(){  
        System.out.println(id + " "+name);  
        System.out.println(address.city + " " + address.state + " " + address.country);  
    }  
      
    public static void main(String[] args) {  
        Address address1 = new Address("Pune","MH","india");  
        Address address2 = new Address("Mumbai","MH","india");  
      
        Employee e1 = new Employee(111,"Taniya",address1);  
        Employee e2 =new Employee(112,"Amol",address2);  
          
        e1.display();  
        e2.display();  
          
    }  
} 