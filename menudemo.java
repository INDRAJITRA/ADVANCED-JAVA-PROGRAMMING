import java.awt.*;
class menudemo extends Frame
{
menudemo()
{
	MenuBar mb=new MenuBar();
	setMenuBar(mb);
	Menu m1=new Menu("File");
	Menu m2=new Menu("Save");
	MenuItem mi1=new MenuItem("New");
	MenuItem mi2=new MenuItem("Open");
	MenuItem mi3=new MenuItem("Save");
	MenuItem mi4=new MenuItem("Save As ");
	CheckboxMenuItem c1=new CheckboxMenuItem("CLick here");
	MenuItem mi5=new MenuItem("Close");
	m1.add(mi1);
	m1.add(mi2);
	m2.add(mi4);
m2.add(c1);
m1.add(mi3);
m1.add(m2);
m1.add(mi4);
mb.add(m1);

}
public static void main(String arg[])
{
	menudemo cd=new menudemo();
		cd.setTitle("menudemo");
		cd.setVisible(true);
		//cd.setSize(300,300);
}
}