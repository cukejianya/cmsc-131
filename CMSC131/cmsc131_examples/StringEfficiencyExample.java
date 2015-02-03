package cmsc131_examples;
import java.util.Date;

public class StringEfficiencyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer strBuff = new StringBuffer();
		String str = new String();
		
		long startTime, stopTime;
		
		for (int i = 0; i < 10; i++) {
			strBuff.append("123456789");
			System.out.println(
					"Used:\t "+ strBuff.length()
					+ "\nCapacity: "+ strBuff.capacity());
			System.out.println();
		}
		//----------
		startTime = new Date().getTime();
		System.out.print("How long to append 123456789 5000 times? ");
		for (int i = 0; i < 5000; i++) {
			strBuff.append("123456789");
		}
		stopTime = new Date().getTime();
		System.out.println("Milliseconds elapsed: " + (stopTime-startTime));
		//--------
		startTime = new Date().getTime();
		System.out.print("What if we used the String class? ");
		for (int i = 0; i < 5000; i++) {
			str += "123456789";
		}
		stopTime = new Date().getTime();
		System.out.println("Milliseconds elapsed: " + (stopTime-startTime));
		//----------
		startTime = new Date().getTime();
		System.out.print("What if we do this 10x more often? ");
		for (int i = 0; i < 50000; i++) {
			//str += "123456789";
			strBuff.append("123456789");
		}
		stopTime = new Date().getTime();
		System.out.println("Milliseconds elapsed: " + (stopTime-startTime));
	}

}
