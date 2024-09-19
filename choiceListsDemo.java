import java.awt.*;
class choiceListsDemo extends Frame
{
 choiceListsDemo()
 {
  setVisible(true);
  setTitle("myFrame");
  setSize(300,300);
  
  setLayout(null);
  
  Choice c=new Choice();
  c.add("JANUARY");
  c.add("FEBRUARY");
  c.add("MARCH");
  c.add("APRIL");
  c.add("MAY");
  c.add("JUN");
  c.add("JULAY");
  c.add("AUGUST");
  c.add("SEPTEMBER");
  c.add("OCTOMBER");
  c.add("NOVEMBER");
  c.add("DECEMBER");
  
  C.setBounds(50,50,100,30);
  c.select(9);
  add(c);
  
  Choice c1=new Choice();
  for(int i=0;i<=31;i++)
  {
   c1.add("  ",+i);
  }
  
  c1.setBounds(100,50,100,30);
  add(c1);
  
 }
 
 public static void main(String args[])
  {
   new choiceListsDemo();
  }
}