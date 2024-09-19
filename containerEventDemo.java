import java.awt.*;
import java.awt.event.*;
class containerEventDemo extends Frame implements ContainerListener
{
	Button b1;
	
	containerEventDemo()
	{
	 
    addContainerListener(this);	
	
	setVisible(true);
	setTitle("containerEventDemo");
	setSize(500,500);
	setLayout(new FlowLayout(FlowLayout.LEFT));
	
	b1=new Button("SUBMITTT");
	add(b1);
	
	 try
	    {
		
		 Thread.sleep(5000);
		 
	    }
	
	catch(Exception e){}
	
	remove(b1);
    }
	
	public void componentAdded(ContainerEvent ce)
	{
		
		System.out.print("\n Added");
		
	}
	
	public void componentRemoved(ContainerEvent ce)
	{
		
		System.out.print("\n Removed");
		
	}
	
	public static void main(String arg[])
	{
		
		new containerEventDemo();
		
	}
}