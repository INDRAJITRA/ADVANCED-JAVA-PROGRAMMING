import javax.swing.*;
import java.awt.*;
class JTabbedPaneDemo1
{
	JTabbedPaneDemo1()
	{
		JFrame jf=new JFrame();
		jf.setSize(500,500);
		jf.setLayout(new FlowLayout());
		
		JPanel jp1=new JPanel();
		JPanel jp2=new JPanel();
		JPanel jp3=new JPanel();
		
		jp1.add(new JButton("This button from panel 1"));
		jp1.add(new JLabel("This is label from panel 1"));
		jp2.add(new JButton("This button from panel 2"));
		jp3.add(new JButton("This button from panel 3"));
		jp3.add(new JButton("This label from panel 3"));
		
		JTabbedPane jtp=new JTabbedPane();
		
		jtp.add("TAB1",jp1);
		jtp.add("TAB2",jp2);
		jtp.add("TAB3",jp3);
		
		jf.add(jtp);
		jf.setVisible(true);
	}
	public static void main(String arg[])
	{
		new JTabbedPaneDemo1();
	}
}
		