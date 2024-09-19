import java.awt.*;
import java.awt.event.*;
class componentEventDemo extends Frame implements ComponentListener
{
	Button b1;
	
	componentEventDemo()
	{
	 
    addComponentListener(this);	
	
	setVisible(true);
	setTitle("componentEventDemo");
	setSize(500,500);
	setLayout(null);
	
	b1=new Button("SUBMITTTTTTTEEEDDDD");
	b1.setBounds(50,50,150,50);
	add(b1);
	
    }
	
	public void componentMoved(ComponentEvent ce)
	{
		
		System.out.print("\n MOVED");
		
	}
	
	public void componentResized(ComponentEvent ce)
	{
		
		System.out.print("\n Resized");
		
	}
	
	public void componentShown(ComponentEvent ce)
	{
		
		System.out.print("\n Shown");
		
	}
	
	public void componentHidden(ComponentEvent ce)
	{
		
		System.out.print("\n Hidden");
		
	}
	public static void main(String arg[])
	{
		
		new componentEventDemo();
		
	}
}