import java.awt.*;
import java.awt.event.*;
class keyEventDemo extends Frame implements KeyListener
{
	Scrollbar s1;
	Label l1;
	
	keyEventDemo()
	{
	
	setVisible(true);
	setTitle("keyEventDemo");
	setSize(500,500);
	setLayout(null);
	
	s1=new Scrollbar();
	s1.setBounds(50,50,50,250);
	add(s1);
	
	l1=new Label();
	l1.setBounds(150,150,150,50);
	add(l1);
	
	s1.addKeyListener(this);
	
	}
	
	public void keyPressed(keyEvent ke)
	{
	
       System.out.println(" Pressed ");
		
	}
	
	public void keyReleased(KeyEvent ke)
	{
	
       System.out.println(" Released ");
		
	}
	
	 public void keyTyped(KeyEvent ke)
	{
	
       System.out.println(" Typed ");
		
	}
	public static void main(String arg[])
	{
	
		new keyEventDemo();
		
	}
}
