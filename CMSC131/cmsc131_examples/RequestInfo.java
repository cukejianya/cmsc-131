package cmsc131_examples;
import java.util.Scanner;

public class RequestInfo {
	public static void main(String[] args) {
		int catsEaten = 0;
		int hairballs = 0;
		String species;
		Scanner sc = new Scanner(System.in);
		System.out.println("What type of species are you?");
		species = sc.next();
		if (species.toLowerCase().equals("dog") || 
				species.toLowerCase().equals("predator")) {
			System.out.println("How many cats have you eaten this year?");
			catsEaten = sc.nextInt();
			
		}
		if (species.toLowerCase().equals("cat") || 
				species.toLowerCase().equals("predator")) {
			System.out.println("How many hairballs have you coughed up this year?");
			hairballs = sc.nextInt();
		}
		if ( !species.toLowerCase().equals("dog") &&
				!species.toLowerCase().equals("cat") && 
				!species.toLowerCase().equals("predator")) {
			System.out.println("You are from another planet");
		} else {
			System.out.println("Species: "+species+"\n\t Number of cats eaten: "+catsEaten+"\n\t Number of hairballs: "+hairballs);
		}
	}
}
