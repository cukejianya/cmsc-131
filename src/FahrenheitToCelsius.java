import java.util.Scanner;

public class FahrenheitToCelsius {
	public static void main(String[] args) {
		double f, c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the temperature in Fahrenheit");
		f = sc.nextDouble();
		c = (float) 5 / 9 *(f - 32);
		System.out.println(c);
	}

}
