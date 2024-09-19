import javax.swing.*;
import java.awt.event.*;
class JOptionPaneDemo extends JFrame
{
	JOptionPaneDemo()
	{
		setVisible(true);
		setTitle("JOptionPaneDemo");
		setSize(500,500);
		setLayout(null);
		
		JOptionPane.showMessageDialog(this,"THIS IS MY FIRST MESSAGE");
		
		JOptionPane.showMessageDialog(this,"THIS IS SECOnD MESSAGE","Alert",JOptionPane.WARNING_MESSAGE);
		
		JOptionPane.showMessageDialog(this,"THIS IS THIRD MESSAGE","Alert",JOptionPane.ERROR_MESSAGE);
		
		JOptionPane.showMessageDialog(this,"THIS IS FOURTH MESSAGE","Alert",JOptionPane.QUESTION_MESSAGE);
		
		JOptionPane.showMessageDialog(this,"THIS IS FIFTH MESSAGE","Alert",JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showConfirmDialog(this,"ARE YOU SURE");
		
		String s=JOptionPane.showInputDialog(this,"PLEASE ENTER YOUR NAME...");
		
		JOptionPane.showMessageDialog(this,"YOUR UNIQUE NAME IS..."+s);
		
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
public static void main(String arg[])
{
  new JOptionPaneDemo();
}
}