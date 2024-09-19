import java.awt.*;
import java.awt.event.*;

class FocussEventDemo extends Frame implements FocusListener 
{

    Button b1;
    Checkbox c1;

    FocussEventDemo() 
	{
        setTitle("FocussEventDemo");
        setSize(500, 500);
        setLayout(null);
        setVisible(true);

        b1 = new Button("SUBMITED");
        b1.setBounds(50, 50, 150, 50);
        add(b1);

        
        c1 = new Checkbox("Tyco");
        c1.setBounds(50, 250, 150, 50);
        add(c1);

      
        b1.addFocusListener(this);
        c1.addFocusListener(this);

        
        addWindowListener(new WindowAdapter() 
		{
            public void windowClosing(WindowEvent we) 
			{
                System.exit(0);
            }
        });
    }

    @Override
    public void focusGained(FocusEvent fe) {
        System.out.println("\nFocusGained : " + fe.getComponent().getClass());
    }

    @Override
    public void focusLost(FocusEvent fe) {
        System.out.println("\nFocusLost : " + fe.getComponent().getClass());
    }

    public static void main(String[] args) {
        new FocussEventDemo();
    }
}
