import javax.swing.*;
import java.awt.*;
class jscrollpanedemo extends JFrame
{
	jscrollpanedemo()
	{
		setTitle("jscrollpanedemo");
		setVisible(true);
		setSize(500,500);
		setLayout(null);
		
		JScrollPane js=new JScrollPane();
		js.setBounds(50,50,300,300);
		add(js);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String arg[])
	{
		new jscrollpanedemo();
	}
}
