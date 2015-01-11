import java.util.Scanner;

public class InitialValues {
	public static void main(String[] args) {
		float taxrate;
		Scanner sc = new Scanner(System.in);
		String state = sc.next();
		
		if (state.equals("MD")) {
			taxrate = 0.06f;
		} else {
			taxrate = 0.0f;
		}
		System.out.println("Your tax rate is "+taxrate);
	}
}
