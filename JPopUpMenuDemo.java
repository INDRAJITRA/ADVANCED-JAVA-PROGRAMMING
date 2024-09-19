import javax.swing.*;
import java.awt.*;
class JPopUpMenuDemo extends JFrame
{
	JPopUpMenuDemo()
	{
		setTitle("JPopUpMenuDemo");
		setVisible(true);
		setSize(500,500);
		setLayout(null);
		
		JMenuItem j1=new JMenuItem("New");
		JMenuItem j2=new JMenuItem("Copy");
		JMenuItem j3=new JMenuItem("Paste");
		JMenuItem j4=new JMenuItem("Save");
		
		JPopUpMenu jp=new JPopUpMenu();
		
		jp.add(j1);
		jp.add(j2);
		jp.add(j3);
		jp.add(j4);
		
		jp.show(this,200,200);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String arg[])
	{
		new JPopUpMenuDemo();
	}
}
