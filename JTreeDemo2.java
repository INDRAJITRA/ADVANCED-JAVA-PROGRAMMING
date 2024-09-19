import javax.swing.*;
import java.awt.*;
import javax.swing.tree.*;
class JTreeDemo2
{
	JTreeDemo2()
	{
		JFrame jf=new JFrame();
		jf.setSize(500,500);
		jf.setLayout(new FlowLayout());
		
		DefaultMutableTreeNode root=new DefaultMutableTreeNode("Engineering");
		DefaultMutableTreeNode r1=new DefaultMutableTreeNode("co");
		DefaultMutableTreeNode r2=new DefaultMutableTreeNode("IT");
		DefaultMutableTreeNode r3=new DefaultMutableTreeNode("Ej");
		DefaultMutableTreeNode r4=new DefaultMutableTreeNode("Mech");
		DefaultMutableTreeNode c1=new DefaultMutableTreeNode("Co-A");
		DefaultMutableTreeNode c2=new DefaultMutableTreeNode("Co-B");
		DefaultMutableTreeNode e1=new DefaultMutableTreeNode("Ej-A");
		DefaultMutableTreeNode e2=new DefaultMutableTreeNode("Ej-B");
		
		JTree jt=new JTree(root);
		
		root.add(r1);
		root.add(r2);
		root.add(r3);
		root.add(r4);
		
		r1.add(c1);
		r1.add(c2);
		r3.add(e1);
		r3.add(e2);
		
		jf.add(jt);
		jf.setVisible(true);
		
	}
	public static void main(String arg[])
	{
		new JTreeDemo2();
	}
}
		