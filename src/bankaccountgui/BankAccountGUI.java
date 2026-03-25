package bankaccountgui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BankAccountGUI implements ActionListener {

	// Define variables for balance and swing objects
	private JTextField textField;
	private JLabel result;
	private JButton buttonSet, buttonDep, buttonWit;
	private double balance = 0.0;
	
	// Constructor creating and adding GUI components using GridBagLayout
	public BankAccountGUI() {
		//GridBagConstraints layout = null;
		
		// Create JFrame and JPanel objects for GUI window 
		// and containers
		JFrame frame = new JFrame("Bank Account");
		JPanel panel = new JPanel();
		
		// Create a label to prompt the user to enter their
		// current balance
		JLabel label = new JLabel("Please enter amount:");
		
		// Add a text field
		textField = new JTextField(10);
		
		// Add buttons for setBalance, Deposit and Withdraw
		buttonSet = new JButton("Set Balance");
		buttonDep = new JButton("Deposit");
		buttonWit = new JButton("Withdraw");
		
		// Empty result to be set by the event listener
		result = new JLabel("Your balance is: $0.00");
		
		// Add items to the panel 
		panel.add(label);
		panel.add(textField);
		panel.add(buttonSet);
		panel.add(buttonDep);
		panel.add(buttonWit);
		panel.add(result);
		
		// Add the panel to the frame
		frame.add(panel);
		
		// Set the size of the GUI window, close operation
		// and make the GUI visible
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		// Attach listeners to the buttons
		buttonSet.addActionListener(this);
		buttonDep.addActionListener(this);
		buttonWit.addActionListener(this);
	}
	
	// Override the ActionListener method
	@Override
	public void actionPerformed(ActionEvent e) {
		// Use a try/catch in case of NumberFormatException
		try {
			// Convert the amount entered from String to double
			double amount = Double.parseDouble(textField.getText());
			
			// Conditional to assign the correct functionality to each button
			// updating the balance
			if (e.getSource() == buttonSet) {
				balance = amount;
			} else if (e.getSource() == buttonDep) {
				balance = balance + amount;
			} else if (e.getSource() == buttonWit) {
				balance = balance - amount;
			} 
			
			result.setText(String.format("Current balance is: $%.2f", balance));
			textField.setText("");
			
		} catch (NumberFormatException ee) {
			result.setText("Please enter a valid number.");	
		}

	}
	
	public static void main(String[] args) {
		// Generate a new GUI object
		BankAccountGUI bankaccountgui = new BankAccountGUI();
	}

}
