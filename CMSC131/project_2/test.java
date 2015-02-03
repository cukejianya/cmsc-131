package project_2;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Pick a height");
		int ht = sc.nextInt();
		System.out.println("Pick an x");
		int x = sc.nextInt();
		System.out.println("Pick an y");
		int y = sc.nextInt();
		int wd = 2*ht;
		
		boolean xRed = ((y/2-1) < x && x <= (y/2));
		boolean xRed2 = (ht-(y/2)-1 <= x && x < ht-(y/2));
		System.out.println(xRed2+" "+y/2);
		
		boolean redBox = ((x == 0 || x == ht - 1) && (y == 0 || x == wd - 1));
		
	}

}
