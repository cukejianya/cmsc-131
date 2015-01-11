import java.util.Scanner;

public class CompoundConditional {
	public static void main(String[] args) {
		int num, months, miles;
		Scanner sc = new Scanner(System.in);
		
		final int LOWER_LIMIT = 30;
		final int UPPER_LIMIT = 70;
		
		System.out.println("Please give us a number between "+LOWER_LIMIT+" and "+UPPER_LIMIT);
		num = sc.nextInt();
		
		if ((num > LOWER_LIMIT) && (num < UPPER_LIMIT)){
			System.out.println("Thank you for listening.");
		} else {
			System.out.println(num+" is not a number between "+LOWER_LIMIT+" and "+UPPER_LIMIT);
		}
		
		final int maxMonth = 3;
		final int maxMiles = 5000;
		
		System.out.println("How many months as it been since your last oil change?");
		months = sc.nextInt();
		
		System.out.println("How many miles have you driven since your last oil change?");
		miles = sc.nextInt();
		
		if ((months >= maxMonth) || (miles > maxMiles)) {
			System.out.println("You need an oil change");
		} else {
			System.out.println("You're okay. You can continue driving.");
		}
	}
}
