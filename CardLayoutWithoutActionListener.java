import javax.swing.*;
import java.awt.*;

public class CardLayoutWithoutActionListener {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("CardLayout Without ActionListener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a JPanel with CardLayout
        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);

        // Create cards
        JPanel card1 = new JPanel();
        card1.add(new JLabel("This is Card 1"));
        card1.setBackground(Color.CYAN);

        JPanel card2 = new JPanel();
        card2.add(new JLabel("This is Card 2"));
        card2.setBackground(Color.YELLOW);

        JPanel card3 = new JPanel();
        card3.add(new JLabel("This is Card 3"));
        card3.setBackground(Color.GREEN);

        // Add cards to cardPanel
        cardPanel.add(card1, "Card 1");
        cardPanel.add(card2, "Card 2");
        cardPanel.add(card3, "Card 3");

        // Add cardPanel to frame
        frame.add(cardPanel);

        // Use a Timer to switch cards every 2 seconds
        Timer timer = new Timer(2000, e -> cardLayout.next(cardPanel));
        timer.start();

        // Make frame visible
        frame.setVisible(true);
    }
}
