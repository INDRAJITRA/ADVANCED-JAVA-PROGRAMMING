import java.awt.*;
class checkboxDemo extends Frame
{
 checkboxDemo()
 {
  setVisible(true);
  setTitle("myFrame");
  setSize(300,300);
  
  setLayout(null);
  
  checkbox c1=new checkbox();
  c1.setBounds(50,50,100,30);
  c1.getLabel("FYCO");
  
  checkbox c2=new checkbox();
  c2.setBounds(50,100,100,30);
  c2.getLabel("SYCO");
  
  checkbox c3=new checkbox("TYCO",True);
  c3.setBounds(50,150,100,30);
  
  add(c1);
  add(c2);
  add(c3);
  
  checkboxGroup cb= new checkboxGroup();
  
  checkbox c4=new checkbox("Male",cb,True);
  c4.setBounds(150,50,100,30);
  
  checkbox c5=new checkbox("Female",cb,False);
  c5.setBounds(150,100,100,30);
  
  checkbox c6=new checkbox("TransGender",cb,True);
  c6.setBounds(150,150,100,30);
  
  add(c4);
  add(c5);
  add(c6);
  
  System.out.println(cb.getSelectedCheckbox());
   
 }
 public static void main(String args[])
  {
    new checkboxDemo();
  }
}