package cmsc131_examples;

public class TryCatchFinally {
	public static int divide(int x, int y){
		int retval;
		
		try {
			retval = x/y;
		} catch (ArithmeticException e) {
			throw e;
		} finally {
			System.out.println("Code has been tried.");
		}
		
		return retval;
	}
	
	public static void main(String[] args) {
		System.out.println(divide(1,0));
	}
}
