package project_3;

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
		boolean yRed = 2*x+1 < y && y < 2*(x+1) 
					|| (wd - (2*x+1) < y) && (wd - y < 2*(x+1));
		System.out.println(xRed);
		
	}

}
