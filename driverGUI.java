import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Hayden Harris - hcharris
 * CIS152
 * Apr 29, 2022
 */
public class driverGUI {

	public static void main(String[] args) {
		
		
		//start program code---
		//making frames and panels for displays
		JFrame frame = new JFrame("Vending Machine");
		JPanel panel = new GUI();
		
		frame.add(panel);
		frame.setSize(450,450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
