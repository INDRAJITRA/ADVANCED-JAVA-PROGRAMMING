import java.awt.*;
import java.awt.event.*;

class actioneventdemo extends Frame implements ActionListener
 {
  Button b1;
  Label l1;
  
  actioneventdemo()
  {
    setTitle("actionevent");
    setSize(500,500);
    setVisible(true);
    setLayout(null);
	
    b1=new Button ("Submit");
    b1.setBounds (50,50,150,50);
    add(b1);
	
    l1=new Label();
    l1.setBounds(50,50,150,150);
    add(l1);
	
    b1.addActionListener(this);
 }
 
  public void actionPerformed (ActionEvent ae)
  {
    b1.setLabel("save");
    l1.setText("Button clicked");
    setTitle("welcome to actionevent");
}

public static void main(String arg[])
{
new actioneventdemo();
}
}