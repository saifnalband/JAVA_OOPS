class Demo280A {
    protected int rollNo = 555;
    protected void msg(){ 
        // protected doesn't work
        System.out.println("Class A: Hello Java!" + rollNo);
    }
}
class Demo280 {
  public static void main(String args[]){
	Demo280A obj = new Demo280A();
	obj.msg();
	}
}