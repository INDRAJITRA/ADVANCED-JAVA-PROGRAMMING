import java.awt.*;
import java.awt.event.*;
class containerAdapterdemo extends Frame
{
  Button b1;
  containerAdapterdemo()
  {
   setTitle("containerAdapterdemo...");
   setSize(300,300);
   setVisible(true);
   
   setLayout(new FlowLayout(FlowLayout.LEFT));
   
   b1=new Button("Submit");
   add(b1);
   
   addContainerListener(new ContainerAdapter()
   {
    public void componentAdded(ContainerEvent ce)
    {
		
      System.out.print("\n Component added");
     }
   });
}

  public static void main(String arg[])
 {
  new containerAdapterdemo();
 }
}