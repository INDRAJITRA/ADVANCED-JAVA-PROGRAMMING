import java.awt.*;
import java.awt.event.*;
class buttonAdapterDemo extends Frame
{
	
  Button b1;
  buttonAdapterDemo()
 {
  setTitle("buttonAdapterDemo...");
  setSize(300,300);
  setVisible(true);
  setLayout(null);
  
  b1=new Button("ok");
  b1.setBounds(50,100,150,30);
  add(b1);
  
  b1.addActionListener(new ActionListener()
  {
    public void actionPerformed(ActionEvent ae)
     {
		 
      b1.setLabel("submit");
      add(b1);
	  
	 }
});
}
  public static void main(String arg[])
  {
    new buttonAdapterDemo();
  }
}