import java.awt.*;
import java.awt.event.*;
class mouseEventDemo extends Frame implements MouseListener
{	
	mouseEventDemo()
	{
	
	setVisible(true);
	setTitle("mouseEventDemo");
	setSize(500,500);
	setLayout(null);
	
	addMouseListener(this);
	
	}
	
	public void mousePressed(MouseEvent me)
	{
	
       System.out.println(" Pressed ");
		
	}
	
	public void mouseReleased(MouseEvent me)
	{
	
       System.out.println(" Released ");
		
	}
	
	 public void mouseClicked(MouseEvent me)
	{
	
       System.out.println(" Clicked ");
		
	}
	
	 public void mouseEntered(MouseEvent me)
	{
	
       System.out.println(" Entered ");
		
	}
	
    public void mouseExited(MouseEvent me)
	{
	
       System.out.println(" Exited ");
		
	}
	public static void main(String arg[])
	{
	
		new mouseEventDemo();
		
	}
}
