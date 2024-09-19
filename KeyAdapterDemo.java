import java.awt.*;
import java.awt.event.*;
class KeyAdapterDemo extends Frame
{
  keydemo()
  {
   setTitle("keydemo..");
   setSize(300,300);
   setVisible(true);
   
   addKeyListener(new KeyAdapter()
    {
     public void keyPressed(KeyEvent ke)
	 {
		 
       int c=ke.getKeyCode();
       if(c==KeyEvent.VK_F1)
	   {
         System.out.print("\n f1 key is pressed");
       }
	   
      if(c==KeyEvent.VK_F2)
	  {
       System.out.print("\n f2 key is pressed");
       }  
	 }
   });
}

  public static void main(String arg[])
  {
   new keydemo();
  }
}