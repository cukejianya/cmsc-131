package project_3;

import java.awt.Color;

public class FlagMaker {
	public static void main(String[] args) {
	}
	public static void drawFlag(MyGrid grid, int countryCode) {
		int ht = grid.getHt();
		int wd = grid.getWd();
		switch (countryCode) { //I used a switch here instead of if statements
								//since there are so many options
		case 1:
			 if (ht%2 == 0) {
		 			for (int x = 0; x < ht; x++) {
	 					for(int y = 0; y < wd; y++) {	
	 						if (x < ht/2) {
			 					grid.setColor(x, y, Color.WHITE);
	 						} else {
	 							grid.setColor(x, y, Color.RED);
	 						}
	 					}
		 			}
		 		}
		case 2:
			if (ht%2 == 0) {
	 			for (int x = 0; x < ht; x++) {
 					for(int y = 0; y < wd; y++) {	
 						if (x < ht/2) {
		 					grid.setColor(x, y, Color.BLUE);
 						} else {
 							grid.setColor(x, y, Color.YELLOW);
 						}
 					}
	 			}
	 		}
		case 3:
			for (int x = 0; x < ht; x++) {
					for(int y = 0; y < wd; y++) {	
						boolean twoBars = y < 2; //For the two first columns
						boolean twoSqLess = ((y - 2) < x) && (x < ht - (y-1)); 
							//I notice that the flag decreased (y - 1)
						boolean cutOff = (y < ht/2 + 1) && (twoSqLess); 
						if (twoBars || (cutOff)) {
							grid.setColor(x, y, Color.BLUE);
						} else if (x < ht/2) {
		 					grid.setColor(x, y, Color.WHITE);
							} else {
								grid.setColor(x, y, Color.RED);
						}
					}
 			}
		case 4:
			if (ht%6 == 0) {
				for (int x = 0; x < ht; x++) {
 					for(int y = 0; y < wd; y++) {	
 						
 						if (y < wd/3) {
 							grid.setColor(x, y, Color.GREEN);
 						} else if (x < ht/2) {
		 					grid.setColor(x, y, Color.YELLOW);
 						} else {
 							grid.setColor(x, y, Color.RED);
 						}
 					}
	 			}
			}
		case 5:
			if (ht%4 == 0) {
				for (int x = 0; x < ht; x++) {
 					for(int y = 0; y < wd; y++) {	
 						if (x < ht/2) {
 							grid.setColor(x, y, Color.BLUE);
 						} else if (x < 3*ht/4) {
		 					grid.setColor(x, y, Color.YELLOW);
 						} else {
 							grid.setColor(x, y, Color.GREEN);
 						}
 					}
				}
			}
		case 6:
			if (ht%2 == 0) {
				for (int x = 0; x < ht; x++) {
 					for(int y = 0; y < wd; y++) {
 						boolean twoBars = y < 2; //For the two first columns
						boolean twoSqLess = ((y - 2) < x) && (x < ht - (y-1)); 
							//I notice that the flag decreased (y - 1) where y
							//started at 0
						boolean cutOff = (y < ht/2 + 1) && (twoSqLess);
						if (twoBars || (cutOff)) {
							grid.setColor(x, y, Color.BLACK);
						} else if (x < ht/2 - 1 || x > ht/2) {
		 					grid.setColor(x, y, Color.BLUE);
						} else {
							grid.setColor(x, y, Color.YELLOW);
						}
 					}
				}
 			}
		case 7:
			if (ht%3 == 0) {
				for (int x = 0; x < ht; x++) {
 					for(int y = 0; y < wd; y++) {
 						if (y < wd/3) {
 							grid.setColor(x, y, Color.BLACK);
 						} else if (y < 2*wd/3) {
 							grid.setColor(x, y, Color.RED);
 						} else {
 							grid.setColor(x, y, Color.GREEN);
 						}
 					}
				}
			}
		// Jersey Flag
		case 8:
			if (ht%2 == 1) {
				for (int x = 0; x < ht; x++) {
 					for(int y = 0; y < wd; y++) {
 						boolean xRed = ((y/2-1) < x && x <= (y/2));
 						if ( xRed) {
 							grid.setColor(x, y, Color.RED);
 							grid.setColor(ht-x-1, y, Color.RED);
 						} else {
 							grid.setColor(x, y, Color.WHITE);
 						}
 					}
				}
			}
			
			
		} //switch end
		
	}
}
