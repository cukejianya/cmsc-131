package cmsc131_examples;
import java.util.Scanner;

public class StarList {
	public static void main(String[] args) {
		int row, col;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rows?");
		row = sc.nextInt();
		System.out.println("How many columns?");
		col = sc.nextInt();
		
		for (int x = 0; x < row; x++) {
			for (int y = 1; y < col; y++) {
				System.out.print("*");
			}
			if (col >= 1) {
				System.out.println("*");
			}
		}
	}
}
