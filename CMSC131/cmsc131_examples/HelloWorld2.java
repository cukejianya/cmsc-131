package cmsc131_examples;

public class HelloWorld2 {
	public static void main(String[] args) {
		System.out.println("Hello, World!");
		myMethod("Hi", "There");
	}
	public static void myMethod(String first, String second) {
		System.out.println(first+" "+second);
		System.out.println(second+" "+first);
	}
}
