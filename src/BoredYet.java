import java.util.Scanner;

public class BoredYet {
	public static void main(String[] args){
		boolean perfUnion;
		String theAnswer;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Have you reach a perfect union yet?");
			theAnswer = sc.next();
			theAnswer.toLowerCase();
			
			perfUnion = theAnswer == "yes" || theAnswer == "true";
		} while (perfUnion);
	}
}
