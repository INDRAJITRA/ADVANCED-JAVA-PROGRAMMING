import java.awt.event.*;
import java.util.*;
import javax.swing.*;
class JSeparatorDemo extends JFrame
{
	JScrollBar()
	{
		setVisible(true);
		setTitle("JSeparatorDemo");
		setSize(500,500);
		setLayout(null);
		
		JButton b1=new JButton("BUTTON 1");
		JButton b2=new JButton("BUTTON 2");
		JButton b3=new JButton("BUTTON 3");
		
		JSeparator s=new JSeparator();
		b1.setBounds(50,50,150,50);
		b2.setBounds(50,150,150,50);
		b3.setBounds(50,250,150,50);
		s.setBounds(50,220,150,10);
		
		add(b1);
		add(b2);
		add(s);
		add(b3);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public static void main(String arg[])
	{
		new JSeparatorDemo();
	}
}