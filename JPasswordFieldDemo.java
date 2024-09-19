import javax.swing.*;
import java.awt.event.*;
class JPasswordFieldDemo extends JFrame
{
	JPasswordFieldDemo()
	{
		setVisible(true);
		setTitle("JPasswordFieldDemo");
		setSize(500,500);
		setLayout(null);
		
		JPasswordField jpf=new JPasswordField("Enter your pasword...");
		jpf.setBounds(50,50,100,80);
		add(jpf);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
public static void main(String arg[])
{
  new JPasswordFieldDemo();
}
}