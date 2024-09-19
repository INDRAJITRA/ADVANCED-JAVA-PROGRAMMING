import javax.swing.*;
import java.awt.*;
class JTableDemo extends JFrame
{
	JTableDemo()
	{
		setTitle("JTableDemo");
		setVisible(true);
		setSize(500,500);
		setLayout(null);
		
		String Data[][]={{"1","AAA","30"},{"2","BBB","90"},{"3","III","95"}};
		String Columns[]={"ID","NAME","MARKS"};
		
		JTable jt=new JTable(Data,Columns);
		JScrollPane js=new JScrollPane(jt); 
		js.setBounds(50,50,300,300);
		add(js);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String arg[])
	{
		new JTableDemo();
	}
}
