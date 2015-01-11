
public class SimpleWhile {
	public static void main(String[] args) {
		int i = 1, sum = 0;
		while (i <= 100) {
			sum = sum + i;
			i++;
		}
		System.out.println("The sum of all the numbers from 1 to 100 is "+sum);
	}
}
