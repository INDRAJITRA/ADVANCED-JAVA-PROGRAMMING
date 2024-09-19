import java.awt.*;
import java.awt.event.*;
class WindowAdapterDemo extends Frame
 {
    WindowAdapterDemo()
	{
	 setTitle("WindowAdapterDemo....");
	 setSize(300,300);
	 setVisible(true);
	 
	addWindowListener(new WindowAdapter()
	{
		public void windowClosing(WindowEvent we){
			dispose();
	}
    });
}

  public static void main(String arg[])
  {
	new WindowAdapterDemo();
	
 }
}
