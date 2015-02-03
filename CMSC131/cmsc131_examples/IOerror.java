package cmsc131_examples;
import java.util.Scanner;

public class IOerror {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.print("Type in a integer: ");
				x = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.println(e);
				sc.next();
			}
		}
		System.out.println("You typed in a integer.");
	}
}
