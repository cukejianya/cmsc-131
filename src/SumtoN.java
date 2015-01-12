import java.util.Scanner;

public class SumtoN {
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pick a positive number");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		
		System.out.println("The sum from 1 to "+num+" is "+sum);
	}
}
