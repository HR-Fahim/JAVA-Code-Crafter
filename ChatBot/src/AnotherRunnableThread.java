import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class AnotherRunnableThread implements Runnable{
	public void run(){
		JFrame frame = new JFrame("AnotherChatBot");
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
			
		
		frame.setSize(400,100);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Hello, this is AnotherChatBot from another Thread!");
		frame.add(label);
		frame.setLocation(200, 400);		
	}

}
