import java.awt.*;
import java.awt.event.*;
class keyAdapterDemo2 extends KeyAdapter
{
  Frame f;
  keyAdapterDemo2()
  {
   f= new Frame("keyAdapterDemo2");
   f.setSize(500,500);
   f.setVisible(true);
   
   f.addKeyListener(this);
}

public void keyTyped(KeyEvent we)
  {
	System.out.print("Typed..");
  }
public static void main (String arg[])
  {
	new keyAdapterDemo2();
  }
}