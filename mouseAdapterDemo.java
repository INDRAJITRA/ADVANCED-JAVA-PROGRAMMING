import java.awt.*;
import java.awt.event.*;
class mouseAdapterDemo extends MouseAdapter
{ 
  Frame f;
  mouseAdapterDemo()
  {
    f=new Frame();
	
    f.setVisible(true);
	f.setTitle("mouseAdapterDemo");
	f.setSize(700,700);
	
	f.addMouseListener(this);
	
  }
  
  public void mouseClicked(MouseEvent me)
  {
	  
    Graphics g=f.getGraphics();
	g.setColor(Color.red);
	g.fillOval(me.getX(),me.getY(),40,40);
	
  }
  
  public static void main(String arg[])
  {
   new mouseAdapterDemo();
  }
  
}