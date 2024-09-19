import javax.swing.*;
import java.awt.*;
import javax.swing.tree.DefaultMutableTreeNode;
class jtreedemo extends JFrame
{
	jtreedemo()
	{
		setTitle("jtreedemo");
		setVisible(true);
		setSize(500,500);
		
		DefaultMutableTreeNode n=new DefaultMutableTreeNode("main");
	    DefaultMutableTreeNode n1=new DefaultMutableTreeNode("fruit");
		DefaultMutableTreeNode n2=new DefaultMutableTreeNode("color");
		
		n1.add(new DefaultMutableTreeNode ("Apple"));
		n1.add(new DefaultMutableTreeNode ("Mango"));
		n1.add(new DefaultMutableTreeNode ("Orange"));
		n2.add(new DefaultMutableTreeNode ("Red"));
		n2.add(new DefaultMutableTreeNode ("Blue"));
		n2.add(new DefaultMutableTreeNode ("Green"));
		
		n.add(n1);
		n.add(n2);
		
		JTree jt=new JTree(n);
		add(jt);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String arg[])
	{
		new jtreedemo();
	}
}
		





