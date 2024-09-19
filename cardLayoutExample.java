import javax.swing.*;
import java.awt.*;

class CardLayoutExample extends JFrame {
    CardLayoutExample() {
        // Set the layout manager to CardLayout
        Container c = getContentPane();
        CardLayout cardLayout = new CardLayout(30, 30);
        c.setLayout(cardLayout);

        // Create buttons
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");

        // Add buttons to the content pane with CardLayout
        c.add("Panel 1", b1);
        c.add("Panel 2", b2);
        c.add("Panel 3", b3);

        // Optional: Set the initial card to be displayed
        cardLayout.show(c, "Panel 1");
    }

    public static void main(String[] args) {
        // Create and set up the frame
        CardLayoutExample frame = new CardLayoutExample();
        frame.setTitle("CardLayout Example");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
