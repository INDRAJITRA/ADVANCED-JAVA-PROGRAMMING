import java.awt.*;
import java.awt.event.*;
class windowAdapterDemo2 extends WindowAdapter
{
  Frame f;
  windowAdapterDemo2()
  {
  f= new Frame("windowAdapterDemo2");
  f.setSize(500,500);
  f.setVisible(true);
  
  f.addWindowListener(this);
}

public void windowClosing(WindowEvent we)
  {
	System.out.print("Closing..");
	f.dispose();
 }
  public static void main (String arg[])
  {
	new windowAdapterDemo2();
  }
}