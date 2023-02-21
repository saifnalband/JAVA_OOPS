/* Run the following program without exception handling mechanism for some input */

// Case : try with multiple catch block��

public class Demo335  {
	public static void main (String args[ ]) {
		int i = args.length; 	  // No of arguments in the command line
		String myString[] = new String[i];	 
		myString[0]=args[0];
			
		if(myString[0].equals("Java")){
			System.out.println("First word is Java !");
		}
		System.out.println( " Number of arguments = " + i );
		int x = 12/ i; 	
		int y[ ] = {555, 999};
		y[ i ] = x;
	}
}
/*Note:
Run this program with the following input:
java Demo335
java Demo335 Java
java Demo335 I love Java
java Demo335 10 20 30 40
*/