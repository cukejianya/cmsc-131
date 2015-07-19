package cmsc132_worksheets;
import javax.swing.*;
import java.awt.event.*;

public class TimerExample {
	private static int ANIMATION_SPEED_MILLISECS = 1000;
	
	public static void main (String[] args) {
		ActionListener timerListener = new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				System.out.println("Hello Everyone!");
			}
		};
		Timer timer = new Timer(ANIMATION_SPEED_MILLISECS, timerListener);
		
		timer.start();
		
		JOptionPane.showMessageDialog(null, "Select OK to end program");
		System.exit(0);
	}
}
