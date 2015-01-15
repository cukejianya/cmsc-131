import java.util.Scanner;

public class StarTriangle {
	public static void main(String[] arg) {
		int base;
		String sign1;
		String sign2;
		int addOne = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pick a number");
		base = sc.nextInt();
		
		for (int n = 0; n < 2; n++) {
			 if (n < 1) {
				 for (int i = -base; i <= base; i++) {
					 if (!(i == 0)) {
						 for (int j = 0+addOne; j < Math.abs(i); j++) {
							 System.out.print("*");
						 }
						 for (int k = base+addOne; k > Math.abs(i); k--) {
							 System.out.print(" ");
						 }
						 System.out.println("");
					 }
				 }
			 } else {
				for (int i = -base; i <= base; i++) {
					 if (!(i == 0)) {
						 for (int k = base+addOne; k > Math.abs(i); k--) {
							 System.out.print(" ");
						 }
						 for (int j = 0+addOne; j < Math.abs(i); j++) {
							 System.out.print("*");
						 }
						 System.out.println("");
					 }
				}
			 }

		 }
	}
}
