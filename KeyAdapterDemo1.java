import java.awt.*;
import java.awt.event.*;
class KeyAdapterDemo1 extends Frame
{
  KeyAdapterDemo1()
 {
  setTitle("Key");
  setSize(500,500);
  setVisible(true);
  setLayout(null);
  
  addKeyListener(new KeyAdapter()
  {
	public void keyPressed(KeyEvent ke)
	{
	  int c=ke.getKeyCode();
	  if(c==KeyEvent.VK_F1)
	  {
		dispose();
      }
	  
	if(c==KeyEvent.VK_F5)
	{
		setSize(900,900);
	}
  }
});
}
  public static void main (String arg[])
  {
	new KeyAdapterDemo1();
  }
}