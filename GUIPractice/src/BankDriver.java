import java.awt.BorderLayout;

import javax.swing.*;
public class BankDriver {
	public static void main(String[] args){
		JFrame frame = new JFrame("Bank of Niehus");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BankPanel panel = new BankPanel();
		
		frame.setLayout(new BorderLayout());
		frame.add(panel, BorderLayout.NORTH);
		frame.getContentPane().add(panel);	
		frame.pack();
		frame.setVisible(true);
	}
	
}
