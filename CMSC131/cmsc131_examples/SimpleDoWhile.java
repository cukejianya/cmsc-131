package cmsc131_examples;
import java.util.Scanner;

public class SimpleDoWhile {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println ("You must enter an odd number for this loop to end");
			num = sc.nextInt();
		} while ((num%2) == 0);
		System.out.println ("Success");
	}
}
