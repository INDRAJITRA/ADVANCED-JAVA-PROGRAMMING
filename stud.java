import java.awt.*;
class studForm extends Frame
{
	studForm()
	{
		setTitle("Student Form");
		setVisible(true);
		setSize(500,500);
		setLayout(null);		
		Label l1=new Label("Name:");
		l1.setBounds(80,50,50,30);
		add(l1);
		
		TextField t1=new TextField();
		t1.setBounds(120,50,150,30);
		add(t1);
		
		Label l2=new Label("Add:");
		l2.setBounds(80,100,50,30);
		add(l2);
		
		TextArea t2=new TextArea();
		t2.setBounds(120,100,150,60);
		add(t2);
		
		Label l3=new Label("DOB:");
		l3.setBounds(80,180,50,30);
		add(l3);
		
		Choice c1=new Choice();
		for(int i=1;i<=31;i++)
		{
			c1.add(""+i);
		}
		c1.setBounds(140,180,50,30);
		add(c1);
		
		Choice c2=new Choice();
		c2.add("Jan");
		c2.add("Feb");
		c2.add("Mar");
		c2.add("Apr");
		c2.add("May");
		c2.add("Jun");
		c2.add("Jul");
		c2.add("Aug");
		c2.add("Sep");
		c2.add("Oct");
		c2.add("Nov");
		c2.add("Dec");
		c2.setBounds(200,180,50,30);
		add(c2);
		
		Choice c3=new Choice();
		for(int i=2000;i<=2024;i++)
		{
			c3.add(""+i);
		}
		c3.select(24);
		c3.setBounds(260,180,60,30);
		add(c3);
		
		Label l4=new Label("Gender:");
		l4.setBounds(80,220,50,30);
		add(l4);
		
		CheckboxGroup cb=new CheckboxGroup();
		Checkbox cb1=new Checkbox("Male",cb,false);
		cb1.setBounds(140,220,50,30);
		Checkbox cb2=new Checkbox("Female",cb,false);
		cb2.setBounds(190,220,50,30);
		add(cb1);
		add(cb2);
		
		Label l5=new Label("Class:");
		l5.setBounds(80,260,50,30);
		add(l5);
		
		Checkbox cb3=new Checkbox("CO");
		cb3.setBounds(140,260,50,30);
		add(cb3);
		
		Checkbox cb4=new Checkbox("IF");
		cb4.setBounds(200,260,50,30);
		add(cb4);
		
		Checkbox cb5=new Checkbox("EJ");
		cb5.setBounds(260,260,50,30);
		add(cb5);
		
		Checkbox cb6=new Checkbox("ME");
		cb6.setBounds(320,260,50,30);
		add(cb6);
		
		
	}
	public static void main(String arg[])
	{
		new studForm();
	}
}