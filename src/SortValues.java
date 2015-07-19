import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;

public class SortValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> allValues = new ArrayList<Integer>();
		String prompt = "Enter integer or \"quit\" to stop";
		
		// Reading values from the user
		String valueStr = JOptionPane.showInputDialog(prompt);
		while (!valueStr.equals("quit")) {
			allValues.add(Integer.parseInt(valueStr));
			valueStr = JOptionPane.showInputDialog(prompt);
		}
		if (allValues.size()!= 0) {
			Collections.sort(allValues);
			
			String output = "Values provided (in sorted order): \n";
			for (int i = 0; i < allValues.size(); i++) {
				int value = allValues.get(i);
				output += value;
				if (i != allValues.size() - 1) {
					output += ",";
				}
				JOptionPane.showMessageDialog(null, output);
			}
		}
	}

}
