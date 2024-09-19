import java.awt.*;
 public class labelDemo;
 {
  public static void main(String args[])
  {
  frame f=new frame("Label Demo");
  f.setVisible(true);
  f.setSize(300,300);
  Label l= new Label("label1: ,Label.RIGHT");
  f.add()l;
  String s=l.getText();
  System.out.println(s);
  System.out.println(l.getAlignment());
  
  }
 }