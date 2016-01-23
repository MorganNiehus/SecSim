import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import java.awt.*;

public class AdminDriverMain {
	public static void main(String[] args){
		JFrame frame = new JFrame("Welcome to the MVD");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tp = new JTabbedPane();
		tp.addTab("Agreement", new agreementPanel());
		
		frame.getContentPane().add(tp);
		frame.pack();
		frame.setVisible(true);
		
	}
}
