import java.util.Scanner;

public class NoHighScore {
	public static void main(String[] args) {
		int score;
		int total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Score");
		score = sc.nextInt();
		if (score <= 10 && score >= 1) {
			total = total + score;
			System.out.println("Enter 2nd Score");
			score = sc.nextInt();
		}
		if (score <= 10 && score >= 1) {
			total = total + score;
			System.out.println("Enter 3rd Score");
			score = sc.nextInt();
		}
		if ((score <= 10 && score >= 1)) {
			total = total + score;
			System.out.println("Enter 4th Score");
			score = sc.nextInt();
		}
		System.out.println("Your total (without the highest score) is: "+total);
	}
}
