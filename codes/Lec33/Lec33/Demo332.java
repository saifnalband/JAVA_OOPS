/* Run the following program with exception handling mechanism for some input */

// Case : Simple try-catch block��

public class Demo332 {
	static int anyFunction (int x, int y ){
		try {
			int a = x/y;
			return a;
		} 
		catch (ArithmeticException e) {
			System.out.println ( " Division by zero" );
		}
		return 0;
	}

	public static void main (String args[]) {
		int a,b, result;
		a=0;
		b=0;
		try{
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			System.out.println("Value of a and b =  "+a+"  "+b);
		}catch(Exception e){}
		result  = anyFunction (a, b); 
		System.out.println ( "\nResult : " + result);
	}
}
/*Note:
Run this program with the following input:
java Demo332 200 10
java Demo332 10 0
*/