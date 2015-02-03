package cmsc131_examples;
import java.util.Scanner;

public class SimpleInput {
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		
		int i;
		float f;
		String s;
		
		i = myScanner.nextInt();
		System.out.println("The integer was a "+i);
		s = myScanner.next();
		System.out.println("The next \'word\' "+ s);
		s = myScanner.nextLine();
		System.out.println("The rest of the line was "+s);
		
		try { 
			myScanner.close();			
		}
		catch (Exception e) {}
	}
}
