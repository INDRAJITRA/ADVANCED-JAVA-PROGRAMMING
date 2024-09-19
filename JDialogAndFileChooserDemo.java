import javax.swing.*;
import javax.swing.*;
class JDialogAndFileChooserDemo extends JFrame
{
	JDialogAndFileChooserDemo()
	{
		setTitle("JDialogAndFileChooserDemo");
		setVisible(true);
		setSize(500,500);
		setLayout(null);
		
		JDialog jd=new JDialog(this,false);
		jd.setVisible(true);
		jd.setSize(200,200);
		
		JFileChooser fc=new JFileChooser();
		fc.setVisible(true);
		fc.setSize(300,300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String arg[])
	{
		new JDialogAndFileChooserDemo();
	}
}
