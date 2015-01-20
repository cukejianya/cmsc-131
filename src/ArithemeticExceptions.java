
public class ArithemeticExceptions {
	
	public static int divide1(int x, int y) {
		return x/y;
	}
	
	public static int divide2(int x, int y) {
		int retval = -1;
		try {
			retval = x/y;
		} catch(ArithmeticException e) {
			System.out.println("Error Divide: "+e.getMessage());
		}
		
		return retval;
	}
	
	public static int divide3(int x, int y) {
		int retval;
		
		try {
			retval = x/y;
		} catch(ArithmeticException e) {
			throw e;
		}
		
		return retval;
	}
	
	public static int divide4(int x, int y) {
		int retval;
		
		try {
			retval = x/y;
		} catch(ArithmeticException e) {
			System.err.println("Bad division in divide4 method.");
			throw e;
		}
		
		return retval;
	}
	
	public static void main(String[] args){
		Integer i = Integer.MAX_VALUE;
		System.out.println(i);
		i+=6456;
		System.out.println(i);
		
		try {
			System.out.println(1/0);
		} catch(ArithmeticException e) {
			System.out.println("Error 0: "+e);
		}
		
		try {
			System.out.println("*"+divide1(1,0));
		} catch(ArithmeticException e) {
			System.out.println("Error 1: "+e);
		}
		
		try {
			System.out.println("*"+divide2(1,0));
		}
		catch(ArithmeticException e) {
			System.out.println("Error 2: " + e);
		}
		
		try {
			System.out.println("*"+divide3(1,0));
		}
		catch(ArithmeticException e) {
			System.out.println("Error 3: " + e);
		}
		
		try {
			System.out.println("*"+divide4(1,0));
		}
		catch(ArithmeticException e) {
			System.out.println("Error 4: " + e);
		}
		
		//System.out.println(1/0);
		//System.out.println(divide1(1,0));
		//System.out.println(divide2(1,0));
		//System.out.println(divide3(1,0));
		//System.out.println(divide4(1,0));
		
		
		System.out.println("Reached The End");
	
	}
}
