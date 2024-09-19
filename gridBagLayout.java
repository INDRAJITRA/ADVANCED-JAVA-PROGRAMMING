import java.awt.*;
class gridBagLayout extends Frame
{

gridBagLayout()
{
setTitle("gridBagLayout");
setVisible(true);
setSize(300,300);
GridBagLayout f=new GridBagLayout();
GridBagConstraints gbc=new GridBagConstraints();
setLayout(f);
Button b1=new Button("Button 1");
gbc.gridx=0;
gbc.gridy=0;
gbc.fill=GridBagConstraints.HORIZONTAL;
add(b1);
Button b2=new Button("Button 2");
gbc.gridx=0;
gbc.gridy=1;
gbc.fill=GridBagConstraints.HORIZONTAL;
add(b2);

}
public static void main(String arg[])
{
	new gridBagLayout();
}
}