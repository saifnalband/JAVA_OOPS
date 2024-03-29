/*
Age oj1 = new Age() {
            @Override
            public void getAge() {
                System.out.print("Age is "+x);
            }
        };


Java program to demonstrate Anonymous inner class
*/

interface Age 
{ 
	int x = 21; 
	void getAge(); 
} 
class DemoAn2 
{ 
	public static void main(String[] args) { 

		// Myclass is hidden inner class of Age interface 
		// whose name is not written but an object to it 
		// is created. 
		Age oj1 = new Age() { 
			@Override
			public void getAge() { 
				// printing age 
				System.out.print("Age is "+x); 
			} 
		}; 
		oj1.getAge(); 
	} 
} 
