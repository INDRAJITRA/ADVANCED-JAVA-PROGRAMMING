import java.awt.*;
import java.awt.event.*;

class actionEventAnnonymusinnerclassesDemo extends Frame
{
  Button b1;
  Label l1;
  
  actionEventAnnonymusinnerclassesDemo()
  {
    
   setTitle("actionEventAnnonymusinnerclassesDemo");	
   setSize(500,500);
   setVisible(true);
   
   b1=new Button("Submit...");
   b1.setBounds(50,50,150,50);
   add(b1);
   
   l1=new Label();
   l1.setBounds(50,50,150,150);
   add(l1);
   
    b1.addActionListener(new ActionListener()
	{
	  public void actionPerformed(ActionEvent AI)
      {
  
        b1.setLabel("Save");
        l1.setText("Action is performed");
        l1.setText("Welcome");
        System.out.print("\n Action Command : "+AI.getActionCommand());
        System.out.print("\n Modifiers : "+AI.getModifiers());
        System.out.print("\n When : "+AI.getWhen());
  }
	
	});
 }


public static void main (String arg[])
  {
	new actionEventAnnonymusinnerclassesDemo();
  }
}