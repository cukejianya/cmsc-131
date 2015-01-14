import java.util.Scanner;

public class LetterGrade {
	public static void main(String[] args) {
		float grade;
		char letter;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("What was your numerical score?");
		grade = sc.nextFloat();
		if (grade >= 90){
			letter = 'A';
		} else if (grade >= 80){
			letter = 'B';
		} else if (grade >= 70) {
			letter = 'C';
		} else if (grade >= 60) {
			letter = 'D';
		} else {
			letter = 'F';
		}
		System.out.println("Your grade: "+letter);
	}
}
