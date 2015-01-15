import java.util.Scanner;

public class MultiTable {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Pick a number");
		num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print(i*j);
				System.out.print("  ");
			}
			System.out.println("");
		}
	}
}
