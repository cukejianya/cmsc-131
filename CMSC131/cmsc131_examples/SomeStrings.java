package cmsc131_examples;

public class SomeStrings {
	public static void main(String[] args){
		String name = "Chin";
		char letter = 'I';
		int number1 = 30;
		float number2 = 13.5F;
		
		System.out.println("Hi\nThere\tClass\\\\\n\n");
		
		System.out.println(name+letter+number1+number2);
		System.out.println(name+letter+(number1+number2));
		
		System.out.println("AB".compareTo("AE"));
		
		Integer x = new Integer(32);
		Integer y = new Integer(4);
		
		y.compareTo(x);
	}
}
