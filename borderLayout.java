import java.awt.*;
class borderLayout extends Frame
{

borderLayout()
{

setTitle("borderLayout");
setVisible(true);
setSize(300,300);

BorderLayout b=new BorderLayout(10,10);
setLayout(b);

add(new Button("EAST"),BorderLayout.EAST);
add(new Button("WEST"),BorderLayout.WEST);
add(new Button("WEST"),BorderLayout.SOUTH);
add(new Button("NORTH"),BorderLayout.NORTH);
add(new Button("CENTER"),BorderLayout.CENTER);

}
public static void main(String arg[])
{
	new borderLayout();
}
}