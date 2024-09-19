 import java.awt.*;
import java.awt.event.*;

class mouseWheelEventDemo extends Frame implements MouseWheelListener
{
   mouseWheelEventDemo()
   {
	   
	setVisible(true);
	setTitle("mouseWheelEventDemo");
	setSize(500,500);
	addMouseWheelListener(this);
	
	}
	
	public void mouseWheelMoved(MouseWheelEvent me)
	{
		
		System.out.print("\n Mouse wheel moved......."+me.getWheelRotation());
		
	}
	
	public static void main(String arg[])
	{
		
		new mouseWheelEventDemo();
		
	}
}