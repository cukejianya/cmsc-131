
public class MutableExample {
	public static void mutatel(MutableInteger a) {
		int local = a.get();
	}
	
	public static void mutate2(int[] a) {
		++a[0];
	}
	
	public static void main(String[] args) {
		MutableInteger x = new MutableInteger(1);
		System.out.println(x);
		mutatel(x);
		System.out.println(x);
		
		int[] y = new int[1];
		y[0] = 1;
		mutate2(y);
		
		System.out.println(y[0]);
	}
}
