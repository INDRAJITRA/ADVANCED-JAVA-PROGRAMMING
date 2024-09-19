import javax.swing.*;
import java.awt.event.*;
class JListDemo extends JFrame
{
	JListDemo()
	{
		setVisible(true);
		setTitle("JListDemo");
		setSize(500,500);
		setLayout(null);
		
		String s[]={"HII","HOW ARE YOU?","WHERE ARE YOU?"};
		JList jl=new JList(s);
		jl.setBounds(50,50,150,150);
		add(jl);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
public static void main(String arg[])
{
  new JListDemo();
}
}