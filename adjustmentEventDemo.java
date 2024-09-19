import java.awt.*;
import java.awt.event.*;
class adjustmentEventDemo extends Frame implements AdjustmentListener
{
	Scrollbar s1;
	Label l1;
	
	adjustmentEventDemo()
	{
	
	setVisible(true);
	setTitle("adjustmentEventDemo");
	setSize(500,500);
	setLayout(null);
	
	s1=new Scrollbar();
	s1.setBounds(50,50,50,250);
	add(s1);
	
	l1=new Label();
	l1.setBounds(150,150,150,50);
	add(l1);
	
	s1.addAdjustmentListener(this);
	
	}
	
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
	
		l1.setText("Value "+ae.getValue());
		
	}
	
	public static void main(String arg[])
	{
	
		new itemEventDemo();
		
	}
}
