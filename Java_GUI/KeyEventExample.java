import java.awt.*;
import java.awt.event.*;

class KeyEventExample extends Frame {
    Label l; // Label to display messages

    KeyEventExample() {
        // Set up the frame
        setSize(300, 300);
        setLayout(null);

        // Initialize the label
        l = new Label();
        l.setBounds(20, 20, 250, 30); // Set bounds for the label
        add(l);

        // TextArea to capture key events
        TextArea textArea = new TextArea();
        textArea.setBounds(20, 60, 250, 150);
        add(textArea);

        // Add Key Listener to the TextArea
        textArea.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                boolean ctrlPressed = (e.getModifiersEx() & InputEvent.CTRL_DOWN_MASK) != 0;

                if (ctrlPressed && keyCode == KeyEvent.VK_C) {
                    l.setText("Ctrl + C was pressed!");
                } else {
                    l.setText("Key Pressed: " + KeyEvent.getKeyText(keyCode));
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new KeyEventExample();
    }
}
