package cmsc131_examples;
import java.util.Scanner;

public class NestedConditional {
	public static void main(String[] args) {
		String animal;
		int numOwned;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your favorit animal? ");
		animal = sc.next();
		System.out.println ("How many "+animal+" do you own?");
		numOwned = sc.nextInt();
		
		if (numOwned < 0) {
			System.out.println("How can you own a negative amount of "+animal);
		} else if (numOwned == 0) {
			System.out.println("I am sorry.");
		} else {
			if (numOwned > 3) {
				System.out.println("That's a lot of "+animal+"s");
			} else if (animal.equals("dog") || animal.equals("cat") || animal.equals("fish")) {
				System.out.println("You are so typical");
			} else {
				System.out.println("That animal is so unique");
			}
		}
		try {
			sc.close();
		} catch (Exception e) {}
	}
}
