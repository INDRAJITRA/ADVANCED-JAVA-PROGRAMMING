import java.awt.event.*;
import java.util.*;
import javax.swing.*;
class JScrollBar extends JFrame
{
	JScrollBar()
	{
		setVisible(true);
		setTitle("JScrollBar");
		setSize(500,500);
		JScrollBar s=new JScrollBar();
		s.setBounds(50,50,150,150);
		add(s);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public static void main(String arg[])
	{
		new JScrollBar();
	}
}