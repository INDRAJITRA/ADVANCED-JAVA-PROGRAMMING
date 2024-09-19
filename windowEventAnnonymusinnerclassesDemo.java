import java.awt.*;
import java.awt.event.*;

class windowEventAnnonymusinnerclassesDemo extends Frame
{

  windowEventAnnonymusinnerclassesDemo()
  {
    
   setTitle("windowEventAnnonymusinnerclassesDemo");	
   setSize(500,500);
   setVisible(true);
   
   addWindowListener(new innerWindow());
  }

class innerWindow extends WindowAdapter
{
 public void windowClosing(WindowEvent we)
 {
  dispose();
 }
}

public static void main (String arg[])
  {
	new windowEventAnnonymusinnerclassesDemo();
  }
}