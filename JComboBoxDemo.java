import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class JComboBoxDemo extends JFrame {

    public JComboBoxDemo() 
	{
        setVisible(true);
        setTitle("JComboBoxDemo");
        setSize(500, 500);
        setLayout(null);
		
		//simple comboBox
		JComboBox jc1=new JComboBox();
		jc1.addItem("DIPLOMA");
		jc1.addItem("PHARMACY");
		jc1.addItem("DEGREE");
		jc1.setBounds(50,50,100,80);
		add(jc1);
		
		
		//by using array of comboBox
		String s[]={"FY","SY","TY"};
		JComboBox jc2=new JComboBox(s);
		jc2.setBounds(150,50,100,80);
		add(jc2);
		
		//by using vector
		Vector v=new Vector();
		v.addElement("CO");
		v.addElement("IT");
		v.addElement("EJ");
		v.addElement("CE");
		v.addElement("EE");
		v.addElement("ME");
		JComboBox jc3=new JComboBox(v);
		jc3.setBounds(250,50,100,80);
		add(jc3);
       
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String args[]) 
	{
       new JComboBoxDemo();
    }
}