import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;





/**
 * Hayden Harris - hcharris
 * CIS152
 * Apr 29, 2022
 */
public class GUI extends JPanel {
	//here is my attempt at a GUI 

	
	JTextField nameField = new JTextField();
	JTextField numField = new JTextField();
	JTextField dateField = new JTextField();
	JTextField leaveField = new JTextField();
	
	public GUI() {
		
		Hotel a = new Hotel("Hilton", 4.3,1);
		Hotel b = new Hotel("Ramada",3.8,2);	
		Hotel c = new Hotel("Hampton Inn",4.5,3);	
		Hotel d = new Hotel("Des Lux Hotel",4.6,4);
		Hotel e = new Hotel("Sheraton",4.1,5);
		
		LinkedListInsert list = d.getList();
		list.printlist(list.head);
		
		
		//label for entering a member id #
				JLabel nameLabel = new JLabel("Enter name: ");
				nameField.setPreferredSize(new Dimension(60,20));
				
				JLabel enterLabel = new JLabel("Enter Selection(1-5");
				numField.setPreferredSize(new Dimension(20,20));
				//JLabel results = new JLabel(list.printlist(list.head));
				

				
				//adding everything in
				add(nameLabel);
				add(nameField);
				add(enterLabel);
				add(numField);
	
	
	}
	
	
}

class buttonListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		
		
	}
}
