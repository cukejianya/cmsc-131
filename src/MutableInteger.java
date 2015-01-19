
public class MutableInteger {
	private int value;
	
	public MutableInteger(int value_in) {
		set(value_in);
	}
	
	public int get() {return value;}
	public void set(int value_in) {value = value_in;}
	
	public String toString() {return Integer.toString(value);}
	
}
