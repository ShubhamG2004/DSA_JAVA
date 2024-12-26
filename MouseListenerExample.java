import java.awt.*;
import java.awt.event.*;

public class MouseListenerExample extends Frame implements MouseListener {
    Label l;

    MouseListenerExample() {
        // Set up the frame
        addMouseListener(this); // Register the frame as the mouse listener
        l = new Label(); // Create a label
        l.setBounds(20, 50, 200, 20); // Set position and size of the label
        add(l); // Add the label to the frame

        setSize(300, 300); // Set frame size
        setLayout(null); // Use null layout for absolute positioning
        setVisible(true); // Make the frame visible

        // Handle window closing
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose(); // Close the frame
            }
        });
    }

    // Implementing the mouse listener methods
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }

    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }

    public static void main(String[] args) {
        new MouseListenerExample();
    }
}
