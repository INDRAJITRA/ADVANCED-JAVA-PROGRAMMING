
import javax.swing.*;
class joptionPane extends JFrame
{
	joptionPane()
	{
		setVisible(true);
		setTitle("joptionPane");
		setSize(500,500);
		JOptionPane.showMessageDialog(this,"This is Message");
	JOptionPane.showMessageDialog(this,"This is Message","Alert",JOptionPane.WARNING_MESSAGE);
	JOptionPane.showConfirmDialog(this,"Are you sure");
	String s=JOptionPane.showInputDialog(this,"Enter name");
		JOptionPane.showMessageDialog(this,"Your name:"+s);
	}
	public static void main(String arg[])
	{
		new joptionPane();
	}
}