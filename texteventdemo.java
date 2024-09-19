import java.awt.*;
import java.awt.event.*;
class texteventdemo extends Frame implements TextListener
	{
		TextField t1,t2,t3;
		texteventdemo()
		{
		setTitle("texteventdemo");
		setVisible(true);
		setLayout(null);
		setSize(500,500);
		
		t1=new TextField();
		t1.setBounds(50,50,200,50);
		add(t1);
		t1.addTextListener(this);
		
		t2=new TextField();
		t2.setBounds(50,150,200,50);
		add(t2);
		t2.addTextListener(this);
		
		t3=new TextField();
		t3.setBounds(50,300,200,50);
		add(t3);
		
		}
		
		public void textValueChanged(TextEvent ae)
		{
			int n1=Integer.parseInt(t1.getText());
			int n2=Integer.parseInt(t2.getText());
			t3.setText(""+(n1+n2));
		}
		
		public static void main(String arg[])
		{
			new texteventdemo();
		}
	}

		