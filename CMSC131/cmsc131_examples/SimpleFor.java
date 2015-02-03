package cmsc131_examples;

public class SimpleFor {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("The sum of 1 through 100 "+sum);
		
	}
}
