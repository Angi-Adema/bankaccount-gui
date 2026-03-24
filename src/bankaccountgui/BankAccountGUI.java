package bankaccountgui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		
		// Create a label to prompt the user to enter their
		// current balance
		JLabel label = new JLabel("Please enter amount:");
		
		// Add a text field and a submit button
		JTextField textField = new JTextField(10);
		JButton buttonSet = new JButton("Set Balance");
		
		// Add button to deposit
		JButton buttonDep = new JButton("Deposit");
		
		// Add button to withdraw
		JButton buttonWit = new JButton("Withdraw");
		
		// Empty result to be set by the event listener
		JLabel result = new JLabel("Your balance is: $0.00");
		
		// Add items to the panel 
		panel.add(label);
		panel.add(textField);
		panel.add(buttonSet);
		panel.add(buttonDep);
		panel.add(buttonWit);
		
		// Add the panel to the frame
		frame.add(panel);
		
		// Set the size of the GUI window, close operation
		// and make the GUI visible
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		// Add an ActionListener for the buttons and override 
		// listener method
		ActionListener buttonEvent = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String response = textField.getText();
				result.setText("Your balance is: $" + )
			}
		};

	}

}
