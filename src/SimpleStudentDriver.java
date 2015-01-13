
public class SimpleStudentDriver {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student ("Sam", 123456789);
		Student s3 = new Student ("Chinedum", 22, 3096231);
		
		System.out.println("Student 1 is "+s1);
		System.out.println("Student 2 is "+s2);
		System.out.println("Student 3 is "+s3);
		System.out.println();
		
		s1.useToken();
		s1 = new Student("Writing Over You", 345363267);
		s2.receiveTokens(3);
		s3.useToken();
		
		System.out.println("Student 1 is " + s1);
		System.out.println("Student 2 is " + s2);
		System.out.println("Student 3 is " + s3);
		System.out.println();
		

		System.out.print("active Student objects: " + Student.howManyNow());
		System.out.println("   Student objects created: " + Student.howManyEver());
		Runtime.getRuntime().gc(); //request garbage collection to occur
		System.out.print("active Student objects: " + Student.howManyNow());
		System.out.println("   Student objects created: " + Student.howManyEver());
		System.out.println();
		
		Student sl = new Student();
		System.out.println(sl);
	}
}
