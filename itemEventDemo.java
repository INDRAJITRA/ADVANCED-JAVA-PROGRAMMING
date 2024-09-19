import java.awt.*;
import java.awt.event.*;
class itemEventDemo extends Frame implements ItemListener
{
	Checkbox c1;
	Label l1;
	
	itemEventDemo()
	{
	
	setVisible(true);
	setTitle("itemEventDemo");
	setSize(500,500);
	setLayout(null);
	c1=new Checkbox("TYCO");
	c1.setBounds(50,50,100,50);
	add(c1);
	l1=new Label();
	l1.setBounds(50,150,100,50);
	add(l1);
	c1.addItemListener(this);
	
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
	
		l1.setText("Selected"+ie.getItem());
		
	}
	
	public static void main(String arg[])
	{
	
		new itemEventDemo();
		
	}
}
