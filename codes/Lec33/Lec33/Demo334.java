/* The following program with exception handling mechanism shows 
how robust it while it is in execution */

class Demo334 {
	public static void main (String args[ ]){
		int number, InvalidCount = 0, validCount = 0;
		for (int i = 0; i < args.length; i++)  
		{
			try {
				number = Integer.parseInt(args[i]);
				validCount++;
			} catch (NumberFormatException e){
				InvalidCount++;
				System.out.println ("Invalid number at " + i +"  "+ args[i]); 
			}
			System.out.println ("Valid number at " + i+"  "+ args[i]);
		}
		System.out.println ("Invalid entries: " + InvalidCount);
		System.out.println ("Valid entries: " + validCount);
	}
}
/*Note:
Run this program with the following input:
java Demo334  1 2 java 3
java Demo334  10 20 30 40
java Demo334  1.0  2 3.0 40 java
java Demo334  4.5 5
*/