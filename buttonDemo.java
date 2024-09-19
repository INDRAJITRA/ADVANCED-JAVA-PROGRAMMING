import java.awt.*;
 public class buttonDemo;
 {
  public static void main(String args[])
  {
  frame f=new frame("Button Demo");
  f.setVisible(true);
  f.setSize(300,300);
  
  f.setLayout(null);
  
  Button b=new Button();
  b.setBounds(50,50,100,50);
  b.setLabel("b=submit");
  
  Button b1=new Button();
  b1.setBounds(50,160,100,50);
  b1.setLabel("b=ok");
  
  f.add(b);
  f.add(b1);
  
  System.out.println(b1.getLabel());
  }
 }
  
  
  
  
  
  
  