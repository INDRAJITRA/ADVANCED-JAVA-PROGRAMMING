import java.awt.*;
import java.awt.event.*;
public class focusEventDemo extends Frame implements FocusListener
{
	Button b1;
	Checkbox c1;
	
	focusEventDemo()
	{
	
	setVisible(true);
	setTitle("focusEventDemo");
	setSize(500,500);
	setLayout(null);
	
	b1=new Button("SUBMITED");
	b1.setBounds(50,50,150,50);
	add(b1);
	
	c1=new Checkbox("Tyco");
	c1.setBounds(50,250,150,50);
	add(c1);
	
	b1.addFocusListener(this);
	c1.addFocusListener(this);
	
    }
	
	public void focusGained(FocusEvent fe)
	{
		
		System.out.print("\n FocusGained : "+fe.getComponent().getClass());
		
	}
	
	public void focusLost(FocusEvent fe)
	{
		
		System.out.print("\n FocusLost : "+fe.getComponent().getClass());
		
	}

	public static void main(String arg[])
	{
		
		new focusEventDemo();
		
	}
}