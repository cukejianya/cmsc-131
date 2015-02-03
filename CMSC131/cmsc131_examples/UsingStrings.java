package cmsc131_examples;
public class UsingStrings {
	public static void main(String[] args) {
		String s1 = "Chinedum";
		String s2 = "chiNEdum";
		String s3 = "ChInEdUm";

		System.out.println("The string " + s1 + " has the lenght of \t"
				+ s1.length());
		System.out.println("Does IgnoreCase work for s1 = s2 \t"
				+ s1.equalsIgnoreCase(s2));
		System.out.println("What is compareTo for s1 and s2: \t"
				+ s1.compareTo(s2));
		System.out.println("What is compareToIgnoreCase for s1 and s2: \t"
				+ s1.compareToIgnoreCase(s2));
		System.out.println("What charater is in the \"middile\" of this \t"
				+ s1.charAt(s1.length() / 2));
		String s4 = s1;
		s4 += s2;
		s4 += s3;
		System.out.println(s4);
	}
}
