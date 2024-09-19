import javax.swing.*;
import java.awt.event.*;
class JCheckBoxDemo extends JFrame
{
	JCheckBoxDemo()
	{
		setVisible(true);
		setTitle("JCheckBoxDemo");
		setSize(500,500);
		setLayout(null);
		
		JCheckBox jc1=new JCheckBox("Hii...Welcome to advance java world");
		JCheckBox jc2=new JCheckBox("Hii...Welcome to My own world");
		jc1.setBounds(50,50,100,80);
		jc2.setBounds(50,100,100,80);
		add(jc1);
		add(jc2);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
public static void main(String arg[])
{
  new JCheckBoxDemo();
}
}