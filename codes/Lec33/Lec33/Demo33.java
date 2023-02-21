
/* Run the following program without exception-handling mechanism for some input */

public class Demo33 {
	static int anyFunction (int x, int y ){
	    	int a = x/y;
			return a;
	}

	public static void main (String args[]) {
		int a,b, result;
		a=0;
		b=0;
		System.out.print("Enter any two integers : ");
		 
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		 
		result  = anyFunction (a, b); 
		System.out.println ( "Result : " + result);
	}
}