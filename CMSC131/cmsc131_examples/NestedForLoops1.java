package cmsc131_examples;

public class NestedForLoops1 {
	public static void main(String[] args){
		for (int x = 1; x <= 5; x++) {
			for (int y = 1; y <= 5; y++) {
				System.out.println(x+", "+y+" ");
			}
			System.out.println();
		}
	}
}
