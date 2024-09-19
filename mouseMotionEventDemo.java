import java.awt.*;
import java.awt.event.*;
class mouseMotionEventDemo extends Frame implements MouseMotionListener
{
	
	mouseMotionEventDemo()
	{
		
	setVisible(true);
	setTitle("mouseMotionEventDemo");
	setSize(500,500);
	addMouseMotionListener(this);
	
	}
	
	public void mouseMoved(MouseEvent me)
	{
		
		System.out.print("\n Mouse moved.......");
		
	}
	
	public void mouseDragged(MouseEvent me)
	{
		System.out.print("\n Mouse dragged.......");
		Graphics g=getGraphics();
		g.setColor(Color.red);
		g.fillOval(me.getX(),me.getY(),10,10);
		
	}
	
	public static void main(String arg[])
	{
		
		new mouseMotionEventDemo();
		
	}
}