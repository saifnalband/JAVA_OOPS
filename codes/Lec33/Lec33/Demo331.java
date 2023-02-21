class Demo331 { 
    static int anyFunction ( int x, int y ) {
        int a = x/y;
		return (a); 
	}
 	public  static void main (String args [ ] ) {
		int result = anyFunction (25, 0) ; 		// Exception occurs here as y = 0 
		System.out.println ( " Result : " + result );
    }
}