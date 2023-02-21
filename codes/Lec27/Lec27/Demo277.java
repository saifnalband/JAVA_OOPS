public class A{
	private A(){
	//private constructor
	}

	void msg(){
		System.out.println("Class A: Hello Java!");
	}
}

public class Demo277 {
	public static void main(String args[]){
		A obj = new A(); //Compile Time Error
	}
}
// Private contructot Error