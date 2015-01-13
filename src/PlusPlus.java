
public class PlusPlus {
	public static void main(String[] args) {
		int x, y;
		
		x=2; y=5;
		System.out.println(x++*y++);
		
		x=2; y=5;
		System.out.println(++x*++y);
		
		x=2; y=5;
		System.out.println(x++*++y);
		
		x=2; y=5;
		System.out.println(++x*y++);
	}
}
