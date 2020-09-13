class Student{
    int rollNo;
    String name, course;
    float fee;

    Student(int rollNo, String name, String course){
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }

    Student(int rollNo, String name, String course, float fee){
        this(rollNo, name, course); // reusing contructors
        this.fee = fee;
    }
    void display(){
        System.out.println(rollNo + " " + name + " " + course + " " + fee);
    }
}