package bankaccountgui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BankAccountGUI {

	public static void main(String[] args) {
		
		// Create JFrame and JPanel objects for GUI window 
		// and containers
		JFrame frame = new JFrame("Bank Account");
		JPanel panel = new JPanel();
		
		// Use a label to prompt the user to enter their
		// current balance
		JLabel label = new JLabel("Please enter amount:");
		
		// Add a text field and a submit button
		JTextField textField = new JTextField(10);
		JButton buttonSet = new JButton("Set Balance");
		
		// Add button to deposit
		JButton buttonDep = new JBotton("Deposit");
		
		// Add button to withdraw
		JButton buttonWit = new JButton("Withdraw");
		
		// Add items to the panel 
		panel.add(label);
		panel.add(textField);
		panel.add(buttonSet);
		panel.add(buttonDep);
		panel.add(buttonWit);
		
		// Add the panel to the frame
		frame.add(panel);

	}

}
