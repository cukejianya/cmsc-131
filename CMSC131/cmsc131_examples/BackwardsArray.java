package cmsc131_examples;
import java.util.Scanner;

public class BackwardsArray {
		public static void main(String[] args){
			int[] numlist;
			int howMany;
			Scanner sc = new Scanner(System.in);
			System.out.println("How many numbers do you want to input?");
			howMany = sc.nextInt();
			numlist = new int[howMany];
			System.out.println("Next, add the "+howMany+" numbers you want");
			
			for (int i = 0; i < howMany; i++){
				System.out.print(i+1+": ");
				numlist[i] = sc.nextInt();
			}
			
			System.out.println(
					"Now we are going to print these numbers out backwards");
			for (int i=howMany-1; i >= 0; i--) {
				if (i > 0) {
					System.out.print(numlist[i]+", ");
				} else {
					System.out.print(numlist[i]);
				}
			}
			sc.close();
		}
}
