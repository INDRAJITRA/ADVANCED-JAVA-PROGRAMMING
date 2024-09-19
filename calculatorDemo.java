import java.awt.*;
import java.awt.event.*;

class calculatorDemo extends Frame implements ActionListener
{
	Label l1,l2,l3;
	Button b1,b2,b3,b4;
	TextField t1,t2,t3;
	
	 calculatorDemo()
	{
		setVisible(true);
		setTitle("Calculator");
		setSize(700,700);
		setLayout(null);
		
		l1=new Label("No.1");
		l2=new Label("No.2");
		l3=new Label("Result");
		l1.setBounds(50,50,50,50);
		l2.setBounds(250,50,50,50);
		
		b1=new Button("+");
		b2=new Button("-");
		b3=new Button("*");
		b4=new Button("/");
		
		b1.setBounds(100,150,50,50);
		b2.setBounds(200,150,50,50);
		b3.setBounds(100,250,50,50);
		b4.setBounds(200,250,50,50);
		
		l3=new Label("Result");
		l3.setBounds(100,350,50,50);
		
	    t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        t3.setEditable(false);

        t1.setBounds(150, 50, 50, 50);
        t2.setBounds(350, 50, 50, 50);
        t3.setBounds(200, 350,50, 50);
		
		add(l1);
		add(l2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		add(l3);
		add(t1);
		add(t2);
		add(t3);	
	  
  }
public void actionPerformed(ActionEvent ae)
{
	Double n1=Double.parseDouble(t1.getText());
	Double n2=Double.parseDouble(t2.getText());
	Double result;
	
	if(ae.getSource()==b1)
	{
	 t3.setText(""+(n1+n2));
	}
	
	else if(ae.getSource()==b2)
	{
	 t3.setText(""+(n1-n2));
	}
	
	else if(ae.getSource()==b3)
	{
	  t3.setText(""+(n1*n2));
    }
	
	else if(ae.getSource()==b4)
	{
     t3.setText(""+(n1/n2));
	}
	 
    else
	{
	  t3.setText("Error");
      return;
	}
	  
 }

   
public static void main(String arg[])
{
  new calculatorDemo();
}
}
		