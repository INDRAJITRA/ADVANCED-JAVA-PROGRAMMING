import javax.swing.*;
import java.awt.event.*;
class jbutton extends JFrame{
	jbutton(){
		setVisible(true);
		setTitle("JButton");
		setSize(500,500);
		setLayout(null);
		ImageIcon i=new ImageIcon("Downloads\\download.jpg");
		JButton j1=new JButton("Submit");
		j1.setBounds(50,50,300,20 0);
		 
		j1.setMnemonic(KeyEvent.VK_S);
		add(j1);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String arg[]){
		new jbutton();
	}
}