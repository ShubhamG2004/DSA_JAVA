import javax.swing.*;
import java.awt.*;

public class GridBagLayout {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Simple GridBagLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        // Set GridBagLayout
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        // Add first button (row 0, column 0)
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(new JButton("Button 1"), gbc);
        
        // Add second button (row 0, column 1)
        gbc.gridx = 1;
        gbc.gridy = 0;
        frame.add(new JButton("Button 2"), gbc);
        
        // Add third button (row 1, column 0)
        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(new JButton("Button 3"), gbc);
        
        // Add fourth button (row 1, column 1)
        gbc.gridx = 1;
        gbc.gridy = 1;
        frame.add(new JButton("Button 4"), gbc);
        
        // Make frame visible
        frame.setVisible(true);
    }
}
