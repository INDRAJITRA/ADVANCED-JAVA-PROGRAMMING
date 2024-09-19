import javax.swing.*;

class JToggleButtonDemo extends JFrame
{
	JToggleButtonDemo()
	{
		setTitle("JToggleButtonDemo");
		setVisible(true);
		setSize(500,500);
		setLayout(null);
		
		JButton b1=new JButton("Submit");
		b1.setBounds(50,50,100,50);
		JToggleButton b2=new JToggleButton("Save");
		b2.setBounds(50,150,100,50);
		
		add(b1);
		add(b2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String arg[])
	{
		new JToggleButtonDemo();
	}
}
