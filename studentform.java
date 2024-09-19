import java.awt.*;
class studentform extends Frame{
public static void main(String args[]){
Frame f=new Frame("Student Form");
f.setLayout(null);
f.setVisible(true);
f.setSize(500,500);
Lable l=new Lable("Student Form",Lable.CENTER);
l.setBounds(50,50,300,50);
Font font=new Font("Calibri",Font.BOLD,25);
add(l);
Lable ll=new Lable("Name:",Lable.LEFT);
ll.setBounds(50,120,100,50);
f.add(ll);
TextField tf=new TextField();
tf.setBounds(200,120,100,50);
f.add(tf);

Label l2=new Label("Address :");
l2.setBounds(50,190,100,50);
f.add(l2);

TextArea ta=new TextArea();
ta.setBounds(150,190,100,50);
f.



add(ta);

}	
}
