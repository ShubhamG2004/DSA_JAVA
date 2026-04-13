import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyTrapToTextField extends JFrame {
    private JTextField textField;

    public KeyTrapToTextField() {
        setTitle("Key Trap Example");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField();
        textField.setEditable(false);
        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Not needed for this implementation
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch (keyCode) {
                    case KeyEvent.VK_F1:
                        textField.setText("F1 Key Pressed");
                        break;
                    case KeyEvent.VK_F2:
                        textField.setText("F2 Key Pressed");
                        break;
                    case KeyEvent.VK_F3:
                        textField.setText("F3 Key Pressed");
                        break;
                    default:
                        textField.setText(""); // Clear the text for other keys
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Not needed for this implementation
            }
        });

        add(textField);
        textField.requestFocusInWindow();
		setVisible(true);
    }

    public static void main(String[] args) {
         new KeyTrapToTextField();
    }
}
