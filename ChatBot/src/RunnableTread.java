import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class RunnableTread extends JFrame implements Runnable{
	
	public void run(){
		
		String str1;
		
		JFrame frame = new JFrame("ChatBot");
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		str1 = JOptionPane.showInputDialog(null, "Hi! I'm ChatBot. Please enter your name here.");	
		
		try {
			if(str1.isEmpty()) {
				throw new Exception("Empty field error!");
			}		
		
		frame.setSize(400,100);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Hello" + " " + str1 + "! " + "How are you?");
		frame.add(label);
		
		JButton btnfine = new JButton("Fine");
		frame.add(btnfine);
		
		btnfine.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e){
				// TODO Auto-generated method stub
				frame.dispose();
				JOptionPane.showMessageDialog(null, "That's great," + " " + str1 + "! " + "Let's try adding two numbers here.");
				
				String strnum1 = JOptionPane.showInputDialog(null, "Enter the first number.");
				int num1 = Integer.parseInt(strnum1);
				
				String strnum2 = JOptionPane.showInputDialog(null, "Enter the second number.");
				int num2 = Integer.parseInt(strnum2);
				
				if(strnum1.isEmpty() || strnum2.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Empty name field error!");
				}
				
				Sum<Integer> sum = new Sum<Integer>(num1, num2);
				
				JOptionPane.showMessageDialog(null, "The answer after adding these two numbers is: " + sum.getSum(sum));
				
				
				System.exit(0);
								
			}
		});
		
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
	}
}