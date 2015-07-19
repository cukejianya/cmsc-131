package cmsc132_worksheets;

public class TV {
	private int diagonalLength;
	private String brand;
	private int channelNum;
	private static final int DIAGONAL_LENGTH = 10;
	private static final String BRAND = "Panasony";

	public TV() {
		this(DIAGONAL_LENGTH, BRAND);
	}

	public TV(String brand) {
		this(DIAGONAL_LENGTH, brand);
	}

	// most general constructor
	public TV(int diagonalLength, String brand) {
		this.diagonalLength = diagonalLength;
		this.brand = brand;
		channelNum = 1;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getDiagonalLength() {
		return diagonalLength;
	}

	public void setDiagonalLength(int diagonalLength) {
		this.diagonalLength = diagonalLength;
	}

	public String toString() {
		return "Brand: " + brand + ", diagonal length: " + diagonalLength
				+ ", channel number: " + channelNum;
	}

	public void chnageChannel(int channelNum) {
		this.channelNum = channelNum;
	}
}
