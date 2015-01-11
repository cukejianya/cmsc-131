import java.util.Scanner;

public class SimpleConditional {
	public static void main(String[] args){
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive odd number: ");
		
		i = sc.nextInt();
		
		if (i%2==1) {
			 System.out.println("That's great. Thank you.");
		} else {
			 System.out.println("That's an even number");
		}
		try {
			sc.close();
		} catch (Exception e) {}
	}
}
