import javax.swing.*;
import java.awt.event.*;
class JMMMDemo extends JFrame
{
	JMMMDemo()
	{
		JMenuBar mb=new JMenuBar();
		setMenuBar(mb);
		
		JMenu m1=new JMenu("FILE");
		JMenu m2=new JMenu("JAVA");
		
		JMenuItem mi1=new JMenuItem("New");
		JMenuItem mi2=new JMenuItem("OPEN");
		JMenuItem mi3=new JMenuItem("SAVE");
		JMenuItem mi4=new JMenuItem("SAVE AS");
		JMenuItem mi5=new JMenuItem("CLOSE");
		
		JCheckBoxMenuItem c1=new JCheckBoxMenuItem("CLICK HERE");
		m1.add(mi1);
		m1.add(mi2);
		
		m1.add(c1);
		
		m1.add(mi3);
		m1.add(m2);
		
		m1.addSeparator();
		
		m1.add(m5);
		m1.add(m1);
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
public static void main(String arg[])
{
  JMMMDemo j=new JMMMDemo();
  j.setTitle("JMENUBAR,JMENU,JMENUITEM");
  j.setVisible(true);
  j.setSize(300,300);
}
}