
public class NestedForLoops2 {
	public static void main() {
	int x, y;
		for (x = 1; x <=5; x++) {
			for (y = 1; y <= x; y++) {
				System.out.println(x+", "+y+" ");
			}
			System.out.println(" ");
		}
	}
}
