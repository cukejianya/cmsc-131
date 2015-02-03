package cmsc132_worksheets;

public class HighDefTV extends TV {
	private static String DIGITAL_CONVERTER = "1280DPI";
	private String digitalConverter;
	
	public HighDefTV() {
		super();
		digitalConverter = DIGITAL_CONVERTER;
	}
	
	// CALLS THE SUPERCLASS CONSTRUCTOR BY USING SUPER
	public HighDefTV(int diagonalLength, String brand, String digitalConverter){
		super(diagonalLength, brand);
		this.digitalConverter = digitalConverter;
	}
	
	public String getDigitalConverter() {
		return digitalConverter;
	}
	
	//overrides toString() and calls the superclass toString()
	public String toString() {
		return super.toString() + " ,Digital converter: "+digitalConverter;
	}
	
	// overloads toString() and uses the other toString() to produce the result
	public String toString(int indentation) {
		String result = "";
		int i;
		
		for(i=0; i < indentation; i++)
			result += " ";
			
		return result + toString();
	}
	
	public void setDigitalConverter(String digitalConverter) {
		this.digitalConverter = digitalConverter;
	}
	
	public static void main(String[] args) {
		HighDefTV tvSet1 = new HighDefTV();
		HighDefTV tvSet2 = new HighDefTV();
		
		TV temp;
	}
	
}
