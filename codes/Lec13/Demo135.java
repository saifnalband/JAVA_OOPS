// Automatic type conversions apply to overloading.
class OverloadMethodDemo {
    void test() {
        System.out.println("No parameters");
    }
  
    // Overload test for two integer parameters.
    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }
  
    // overload test for a double parameter and return type
    void test(double a) {
        System.out.println("Inside test(double) a: " + a);
    }
}
    
class Demo135 {
    public static void main(String args[]) {
        OverloadMethodDemo ob = new OverloadMethodDemo();
        int i = 88;
  
        ob.test(); 
        ob.test(10, 20);
  
        ob.test(i); // this will invoke test(double)
        ob.test(123.2); // this will invoke test(double)
        System.out.println(i);
    }
}