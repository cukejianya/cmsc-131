package cmsc131_examples;

public class NestedForLoops2 {
	public static void main() {
		for (int x = 1; x <=5; x++) {
			for (int y = 1; y <= x; y++) {
				System.out.println(x+", "+y+" ");
			}
			System.out.println(" ");
		}
	}
}
