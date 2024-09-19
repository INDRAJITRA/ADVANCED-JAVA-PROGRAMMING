import java.awt.*;
class list extends Frame{
list(){
	
	setTitle("List");
	setSize(300,300);
	setVisible(true);
setLayout(null);
Choice c=new Choice();
c.setBounds(50,50,100,50);

c.add("jan");
c.add("feb");
c.add("mar");
c.add("apr");
c.add("jun");
add(c);

List l= new List();
l.setBounds(50,150,100,50);
l.add("sun");
l.add("mon");
l.add("tue");
l.add("wed");
l.add("thur");
add(l);
}
public static void main(String arr[]){
	new list();
}
}