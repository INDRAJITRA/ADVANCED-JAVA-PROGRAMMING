import java.awt.*;
import java.awt.event.*;

class AnnonymusinnerrclassDemo extends Frame
{
 
  AnnonymusinnerrclassDemo()
  {
   setTitle("AnnonymusinnerrclassDemo");
   setSize(500,500);
   setVisible(true);
   
   addMouseListener(new MouseAdapter()
   {
     public void mouseClicked(MouseEvent me)
	 {
	  System.out.println("\n clicked.....");
	 }
   });
  }
  
public static void main (String arg[])
  {
	new AnnonymusinnerrclassDemo();
  }
}