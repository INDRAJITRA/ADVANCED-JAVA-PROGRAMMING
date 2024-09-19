import javax.swing.*;
import java.awt.event.*;
class jTTADemo extends JFrame
{
	jTTADemo()
	{
		setVisible(true);
		setTitle("JTEXTFIELD AND JTEXTAREA");
		setSize(500,500);
		setLayout(null);
		
		JTextField jt= new JTextField("address...");
		jt.select(1,5);
		jt.setBounds(50,50,100,50);
		System.out.println(jt.getSelectedText());
		add(jt);
		
		JTextArea ja=new JTextArea("address...");
		ja.setBounds(180,50,150,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String arg[]){
		new jTTADemo();
	}
}