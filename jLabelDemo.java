import javax.swing.*;
import java.awt.event.*;
class jLabelDemo extends JFrame
{
	jLabelDemo()
	{
		setVisible(true);
		setTitle("JButton");
		setSize(500,500);
		setLayout(null);
		ImageIcon i=new ImageIcon("Downloads\\download.jpg");
		JLabel jl = new JLabel(i);
		jl.setBounds(50,50,300,20 0);
		jl.setToolTipText("MY IMAGE DISPLAYED");
		add(jl);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String arg[]){
		new jLabelDemo();
	}
}