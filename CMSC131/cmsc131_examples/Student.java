package cmsc131_examples;

public class Student {
	//Instance Variables
	//Private variables can not be directly accessed by "outside world"
	private String name;
	private String ident;
	
	//Public variables can be directly accessed
	public int tokenLevel; 
	
	
	
	//Static Variables - these need to be initialized here
	private static int currentCount = 0; 
	private static int overallCount = 0; 
	
	//Static Constants - these also need to be initialized here
	private static final int DEFAULT_IDENT = -1;
	private static final int DEFAULT_TOKENS = 3;
	
	
	
	
	//Constructors
	public Student(String nameIn, int tokensIn, int identIn) {
		//In the following three lines, we assign values to 
		// the instance variables of the newly create object.
		name = nameIn;
		tokenLevel = tokensIn;
		ident = convertIntToString(identIn);
		
		//In the following two lines we increment the static 
		// variables that all instances of the class share.
		currentCount++;
		overallCount++;
	}

	public Student(String nameIn, int identIn) {
		//invoke "primary" constructor with these values and default tokens
		this(nameIn, DEFAULT_TOKENS, identIn); 
		//"this" refers to the object that is currently being created
	}
	
	public Student() {
		//invoke "primary" constructor with all of our defaults
		this("Unknown", DEFAULT_TOKENS, DEFAULT_IDENT); 
		//"this" refers to the object that is currently being created
	}

	//Copy Constructor
	public Student(Student aStudent) {
		//invoke "primary" constructor with values from the Student parameter
		this(
				aStudent.name, 
				aStudent.tokenLevel, 
				convertStringToInt(aStudent.ident)
		);
		//"this" refers to the object that is currently being created
	}

	
	
	//So-called "destructor" but not like in other languages
	protected void finalize() throws Throwable
	{
	  //NOTE: This is only called if/when garbage collection takes place
	  //      to clean up no longer used memory.
	  currentCount--;
	  super.finalize(); //We'll talk more about this line later...
	} 
	
	
	
	
	//Class-specific Instance Methods
	public void sayHello() {
		System.out.println(
				"Hello, my name is " + name + 
				" and I have " + tokenLevel + " tokens."
		);
	}

	public void useToken() {
		tokenLevel--;
	}

	public void receiveTokens(int numberOfTokens) {
		tokenLevel += numberOfTokens;
	}

	public int getLastFourIdentDigits() {
		return 
		    Integer.parseInt(ident.substring(5,9));
	}
	
	
	//Static Helper Methods that don't use any class data
	private static String convertIntToString(int inVal) {
		String retval;

		if ((inVal > 0) && (inVal < 1000000000)) {
			retval = Integer.toString(inVal);
		}
		else {
			retval = "000000000";
		}

		return retval;
	}
	
	private static int convertStringToInt(String inVal) {
		return Integer.parseInt(inVal);
	}



	
	//"Java-Expected" Instance Methods
	public boolean equals(Student otherStudent) {
		return 
			(ident == otherStudent.ident) && 
			(tokenLevel == otherStudent.tokenLevel) &&
			name.equals(otherStudent.name);
	}

	public String toString() {
		return 
			"Name: " + name + ", ID: " + ident + ", Tokens: " + tokenLevel;
	}
	
	
	
	
	//Static Methods
	public static int howManyNow() {
		return currentCount;
	}
	
	public static int howManyEver() {
		return overallCount;
	}

	
}
