import javax.swing.*;
import java.awt.event.*;
class jprogressbardemo extends JFrame
{
    JProgressBar jp;
	jprogressbardemo()
	{
		setTitle("jprogressbardemo");
		setVisible(true);


		setLayout(null);
		jp=new JProgressBar(0,1000);
		jp.setStringPainted(true);
		jp.setBounds(50,50,200,50);
		add(jp);
		
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void progress()
	{
		for(int i=0;i<=1000;i+=20)
		{
			jp.setValue(i);
			try
			{
				Thread.sleep(50);
			}
			catch(Exceptiom e){}
		}
	}
	public static void main(String arg[])
	{
		j=new jprogressbardemo();
		j.progress();
	}
}

		
