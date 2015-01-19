
public class StringsAndMutability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringHolder s1 = new StringHolder("One");
		
		s1.addOn("Two");
		StringHolder s2 = new StringHolder(s1);
		s1.addOn("Three");
		
		
		System.out.println("S1: "+s1);
		System.out.println("S2: "+s2);
	}

}
