 import java.awt.*;
import java.awt.event.*;
class windowEventDemo extends Frame implements MouseWheelListener
{
	
  windowEventDemo()
  {
	  
	setVisible(true);
	setTitle("windowEventDemo");
	setSize(500,500);
	addMouseWheelListener(this);
	
	}
	
	public void windowevent(MouseWheelEvent me)
	{
		
		System.out.print("\n Mouse wheel moved......."+me.getWheelRotation());
		
	}
	
	public static void main(String arg[])
	{
		
		new windowEventDemo();
		
	}
}