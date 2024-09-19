import javax.swing.*;
import java.awt.*;
class jtabbedpanedemo extends JFrame
{
	jtabbedpanedemo()
	{
		setTitle("jtabbedpanedemo");
		setVisible(true);
		setSize(500,500);
		
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		
		String s[]={"Apple","Banana","Orange"};
		JComboBox j=new JComboBox(s);
		p1.add(j);
		
		JCheckBox c1=new JCheckBox("India");
		JCheckBox c2=new JCheckBox("USA");
		JCheckBox c3=new JCheckBox("China");
		
		p2.add(c1);
		p2.add(c2);
		p2.add(c3);
		
		String s1[]={"Red","Green","Blue"};
		JList l=new JList(s1);
		p3.add(l);
		
		JTabbedPane jt=new JTabbedPane();
		jt.add("Fruits",p1);
		jt.add("Country",p2);
		jt.add("Color",p3);
		add(jt);
		
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String arg[])
	{
		new jtabbedpanedemo();
	}
}


		



