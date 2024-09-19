import javax.swing.*;
class FDDemo
{
	FDDemo()
	{
		JFrame jf=new JFrame();
		jf.setSize(500,500);
		jf.setLayout(null);
		jf.setVisible(true);
		JProgressBar jp=new JProgressBar();
		jp.setBounds(100,100,100,100);
		jp.setToolTipText("Installing...");
		try
		{
			for(int i=0;i<=100;i++)
			{
				jp.setValue(i);
				jp.setStringPainted(true);
				Thread.sleep(50);
				jf.add(jp);
			}
		}
		catch(Exception e)
		{
		}
	}
	public static void main(String arg[])
	{
		new FDDemo();
	}
}