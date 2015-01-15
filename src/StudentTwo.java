
public class StudentTwo {
	//Instance Variables
	private String name; //a reference to a String
	private String ident; //a reference to a String
	private int tokenLevel;
	
	//Static Variables - these need to be initialized here
	private static int currentCount = 0;
	private static int overallCount = 0;
	
	private static final int defaultIdent = -1;
	private static final int defaultTokens = 3;
	
	//Getters and Setters
	public void setName(String nameIn) {
		this.name = nameIn;
	}
	private void setIdent (int identIn) {
		this.ident = convertIntToString(identIn);
	}
	private void setTokenLevel(int tokenLevelIn){
		//NOTE:	This is a set to private so the 'outside world' can't
		//		access it to aribitrarily set a token level. They
		//		will have to use the public methods available below.
		//		We sometimes have setters just for internal use.
		this.tokenLevel = tokenLevelIn;
	}
	public String getName() {
		return this.name;
	}
	public int getIdent() {
		return convertStringToInt(this.ident);
	}
	public int getTokenLevel() {
		return this.tokenLevel;
	}
	
	//Constructors
	public StudentTwo(String nameIn, int tokenLevelIn, int identIn) {
		setName(nameIn);
		setTokenLevel(tokenLevelIn);
		setIdent(identIn);
		
		currentCount++;
		overallCount++;
	}
	
	public StudentTwo(String nameIn, int identIn) {
		this(nameIn, defaultTokens, identIn);
	}
	
	public StudentTwo() {
		this("Unknown", defaultTokens, defaultIdent);
	}
	
	//Copy Constructor
	public StudentTwo(StudentTwo aStudent) {
		this(
					aStudent.name,
					aStudent.tokenLevel,
					convertStringToInt(aStudent.ident)
				);
	}
	//So-called "destructor" but not like in other languages
	protected void finalize() throws Throwable
	{
		//Note: This is only called if/when garbage collection takes place
		//		to clean up no longer used memory.
		currentCount--;
		super.finalize(); //We'll talk more about this line later...
	}
	
	
	//Class-specific Instance Methods
	public boolean useToken() {
		boolean retval;
		
		if (tokenLevel > 0) {
			tokenLevel--;
			retval = true;
		} else {
			retval = false;
		}
		return retval;
	}
	
	public void receiveTokens(int numberOfTokens) {
		tokenLevel += numberOfTokens;
	}
	
	public int getLastFourIdentDigits() {
		return
				Integer.parseInt(ident.substring(5,9));
	}
	
	//Static helper Methods that don't use any class data
	private static String convertIntToString(int inVal) {
		String retval;
		
		if((inVal > 0) && (inVal < 1000000000)) {
			String convertedNumber = Integer.toString(inVal);
			int leadingZeroCount = 9 - convertedNumber.length();
			String leadingZeroHolder = "";
			for (int i = 0; i < leadingZeroCount; i++) {
				leadingZeroHolder += "0";
			}
			retval = leadingZeroHolder+convertedNumber;
		} else {
			retval = "000000000";
		}
		return retval;
	}
		
	private static int convertStringToInt(String inVal) {
		return Integer.parseInt(inVal);
	}
	
	//"Java-Expected" Instance Methods
	public String toString() {
		return
				"Name: "+name+", ID: "+ident+", Tokens: "+tokenLevel;
	}
	
	public boolean equals(StudentTwo otherStudent) {
		//NOTE: Wewill revisit this method later in the semester.
		return
				(ident == otherStudent.ident) &&
				(tokenLevel == otherStudent.tokenLevel) &&
				name.equals(otherStudent.name);
	}
	
	//Static Methods
	public static int howManyNow() {
		return currentCount;
	}
	public static int howManyEver() {
		return overallCount;
	}
}
