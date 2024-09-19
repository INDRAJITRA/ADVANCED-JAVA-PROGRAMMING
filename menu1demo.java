import java.awt.*;
class menu1demo extends Frame
{
  menu1demo()
  {
   setTitle("Menudemo");
   setVisible(true);
   setSize(300,300);
   
   MenuBar mb=new MenuBar();
   setMenuBar(mb);
   
   Menu m1=new Menu("FILE");
   Menu m2=new Menu("SAVE");
   
   MenuItem mi1=new MenuItem("NEW");
   MenuItem mi2=new MenuItem("OPEN");
   MenuItem mi3=new MenuItem("SAVE");
   MenuItem mi4=new MenuItem("SAVE AS");
   MenuItem mi5=new MenuItem("CLOSE"); 
   
   CheckboxMenuItem c1= new CheckboxMenuItem("EDIT");
   CheckboxMenuItem c2= new CheckboxMenuItem("CLIcK HERE");
   
   m1.add(mi1);
   m1.add(mi2);
   m1.add(mi3);
   m1.add(mi4);
   m1.add(mi5);
   m1.add(m2);
   
   m2.add(c1);
   m2.addSeparator();
   
   m2.add(c1);
   mb.add(m1);
  
   
  }
public static void main(String arg[])
{
	new menu1demo();
}
}