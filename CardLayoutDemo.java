import javax.swing.*;
import java.awt.*;

public class CardLayoutDemo extends JFrame {

    private CardLayout cardLayout;
    private JPanel cardPanel;
    private JButton button1, button2, button3;

    public CardLayoutDemo() {
        super("Card Layout Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        button3 = new JButton("Button 3");

        cardPanel.add("card1", button1);
        cardPanel.add("card2", button2);
        cardPanel.add("card3", button3);

        add(cardPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new CardLayoutDemo();
    }
}