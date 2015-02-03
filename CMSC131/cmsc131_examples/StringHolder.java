package cmsc131_examples;

public class StringHolder {
	private String textValue1;
	private StringBuffer textValue2;
	private int numberValue;
	
	public String gettextValue1() {
		return textValue1;
	}
	
	public StringBuffer gettextValue2() {
		return textValue2;
	}
	
	public int getnumberValue() {
		return numberValue;
	}
	
	public StringHolder(String initValue) {
		textValue1 = new String(initValue);
		textValue2 = new StringBuffer(initValue);
		numberValue = 0;
	}
	public StringHolder (StringHolder anotherSH) {
		textValue1 = new String(anotherSH.textValue1);
		textValue2 = new StringBuffer(anotherSH.textValue2);
		numberValue = anotherSH.numberValue;
	}
	
	public void addOn (String addThis) {
		textValue1 += addThis;
		textValue2.append(addThis);
		numberValue++;
	}
	
	public String toString(){
		return "str: "+textValue1 + "\t\t\t strBuff: " + textValue2 + "\t\t\t Value1: " + numberValue;
	}
	
	public boolean equals(Object anotherStringHolder) {
		return 
		  textValue1.equals(((StringHolder)anotherStringHolder).textValue1) 
		    && 
		  textValue2.toString().equals(
				  ((StringHolder)anotherStringHolder).textValue2.toString()) 
		    && 
		  numberValue == ((StringHolder)anotherStringHolder).numberValue;
	}
	
}
