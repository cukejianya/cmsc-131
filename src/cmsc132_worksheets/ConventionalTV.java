package cmsc132_worksheets;

public class ConventionalTV extends TV{
	private static final String DEFAULT_CRT = "A";
	private String CRTType;
	
	public ConventionalTV() {
		super(20, "GEConv");
		CRTType = DEFAULT_CRT;
	}
	
	
	public ConventionalTV(String CRTType) {
		super(30, "GEConvSpec");
		this.CRTType = CRTType;
	}
	
	public ConventionalTV(int diagonalLength, String brand, String CRTType) {
		super(diagonalLength, brand);
		this.CRTType = CRTType;
	}
	
	public String toSTring() {
		return super.toString() + ", CRT type: "+ CRTType;
	}
	
	public static void main(String[] args) {
		ConventionalTV tvSet1 = new ConventionalTV();
		ConventionalTV tvSet2 = new ConventionalTV(32, "GE", "B");
		
		System.out.println(tvSet1);
		System.out.println(tvSet2);
	}
}
