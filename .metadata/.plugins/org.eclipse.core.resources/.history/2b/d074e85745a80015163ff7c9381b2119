import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;

public class BankPanel extends JPanel{
	
	private final int WIDTH = 500, HEIGHT = 500;
	private double balance = 0;
	private JLabel balanceLabel, resultLabel;
	private JTextField deposit;
	private JTextField withdraw;
	
	public BankPanel(){
	
		balanceLabel = new JLabel("Deposit");
		resultLabel = new JLabel("---");		
		
		deposit = new JTextField(10);
		withdraw = new JTextField(10);
		
		NumberListener listener = new NumberListener();
		deposit.addActionListener(listener);
		withdraw.addActionListener(listener);
		
		add(balanceLabel);
		add(deposit);
		add(withdraw);
		add(resultLabel);
		
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.white);
	}
	private class NumberListener implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			if(event.getSource() == deposit){
				double dAmount;
				String sAmount = deposit.getText();
				try{
				dAmount = Double.parseDouble(sAmount);
				}
				catch(NumberFormatException e){
					System.out.println("ERROR: no input");
					dAmount = 0;
				}
				balance += dAmount;
				NumberFormat fmt = NumberFormat.getCurrencyInstance();
				resultLabel.setText("Balance: " + fmt.format(balance));
			}
			if(event.getSource() == withdraw){
				double dAmount;
				String sAmount = withdraw.getText();
				try{
				dAmount = Double.parseDouble(sAmount);
				}
				catch(NumberFormatException e){
					System.out.println("ERROR: no input");
					dAmount = 0;
				}
				balance -= dAmount;
				NumberFormat fmt = NumberFormat.getCurrencyInstance();
				resultLabel.setText("Balance: " + fmt.format(balance));
			}
		}
	}		

}
