import java.awt.*;
class flowLayout extends Frame
{
flowLayout()
{
setTitle("flowLayout");
setVisible(true);
setSize(300,300);
FlowLayout f=new FlowLayout(FlowLayout.RIGHT,50,50);
setLayout(f);
Button b1=new Button("Button 1");
add(b1);
Button b2=new Button("Button 2");
add(b2);

}
public static void main(String arg[])
{
	new flowLayout();
}
}