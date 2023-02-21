/*The following program shows the use of this()
to avoid the name-space collision and contructor overloading */
              

class Student{  
	int rollno;  
	String name, course;  
    float fee;
      
	Student(int rollno, String name, String course){  
	    this.rollno = rollno;  
	    this.name = name;  
	    this.course = course;  
    }  

    Student(int rollno, String name, String course, float fee){  
    	this(rollno,name,course);//reusing constructor  
    	this.fee = fee;  
    }

    void display(){
        System.out.println(rollno+" "+name+" "+course+" "+fee);
    }  
}  
class Demo132a{  
	public static void main(String args[]){ 
        // contructors with different arguments  
	    Student s1 = new Student(101,"Aryan","java");  
	    Student s2 = new Student(102,"Garima","java",6000f);  
	    s1.display();  
	    s2.display();  
    }   
}