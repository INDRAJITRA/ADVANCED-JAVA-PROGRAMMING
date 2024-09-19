import javax.swing.*;
import java.awt.event.*;
class JRadioButtonDemo extends JFrame
{
	JRadioButtonDemo()
	{
		setVisible(true);
		setTitle("JRadioButtonDemo");
		setSize(500,500);
		setLayout(null);
		
		ButtonGroup bg=new ButtonGroup();
		JRadioButton rb1=new JRadioButton("FYCO");
		JRadioButton rb2=new JRadioButton("SYCO");
		JRadioButton rb3=new JRadioButton("TYCO",true);
		
		rb1.setBounds(50,50,100,80);
		rb2.setBounds(50,100,100,80);
		rb3.setBounds(50,150,100,80);
		
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		
		add(rb1);
		add(rb2);
		add(rb3);
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
public static void main(String arg[])
{
  new JRadioButtonDemo();
}
}