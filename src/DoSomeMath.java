
public class DoSomeMath {
	public static void main(String[] args){
		int x;
		int y;
		x = 23;
		y = 15;
		printSum(x,y);
		printProd(x,y);
		printQuot(x,y);
		printQuot(y,x);
	}
	public static void printSum(int first, int second) {
		System.out.println(first + second);
	}
	public static void printProd(int alpha, int beta) {
		System.out.println(alpha*beta);
	}
	public static void printQuot(int alpha, int second) {
		System.out.println(alpha/second);
	}
}
