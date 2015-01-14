import java.util.Scanner;

public class FahrenheitOrCelsius {
	public static void main(String[] args) {
		double f, c;
		String unit, ans;
		Scanner sc = new Scanner(System.in);
		boolean repeat = true;
		while (repeat) {
			System.out.println("What units of measurement are you using? Type F for Fahrenheit or type C for Celsius");
			unit = sc.next();
			if (unit.toLowerCase().equals("f")) {
				System.out.println("Enter the temperature in Fahrenheit");
				f = sc.nextDouble();
				c = (float) 5 / 9 *(f - 32);
				System.out.println(c);
			} else if (unit.toLowerCase().equals("c")) {
				System.out.println("Enter the temperature in Celsius");
				c = sc.nextDouble();
				f = (float) 9 / 5 * c + 32;
				System.out.println(f);
			} else {
				System.out.println("We cannot compute the unit you gave us");
			}
			do {
				System.out.println("Do you want to do another conversion? Y or N");
				ans = sc.next();
				if (ans.equals("N")) {
					repeat = false;
				} 
			} while (!ans.equals("Y") && !ans.equals("N"));
		}
	}
}
