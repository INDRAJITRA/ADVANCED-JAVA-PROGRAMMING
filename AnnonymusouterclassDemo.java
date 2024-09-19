import java.awt.*;
import java.awt.event.*;

class AnnonymusouterclassDemo extends Frame
{
  Frame f;
  AnnonymusouterclassDemo()
  {
	  
   f= new Frame("AnnonymusouterclassDemo");
   f.setSize(500,500);
   f.setVisible(true);
   
   addMouseListener(new innermouse());
  }

class innermouse extends MouseAdapter
{
 public void mouseClicked(MouseEvent me)
 {
   System.out.print("\n clicked..");
 }
}

public static void main (String arg[])
  {
	new AnnonymusouterclassDemo();
  }
}