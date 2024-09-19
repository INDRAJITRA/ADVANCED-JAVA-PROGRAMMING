import java.awt.*;
class gridLayout extends Frame
{

gridLayout()
{

setTitle("gridLayout");
setVisible(true);
setSize(300,300);

setResizable(true);


GridLayout g=new GridLayout(4,5,10,10);
setLayout(g);

for(int i=1;i<=20;i++)
{
add(new Button("Button "+i));
}

}
public static void main(String arg[])
{
	new gridLayout();
}
}