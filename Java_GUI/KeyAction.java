import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class KeyAction extends JFrame {
    JTextArea t; 

    KeyAction() {
        
        setSize(400, 400);
        setTitle("Key Typed");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        t = new JTextArea();
        t.setBounds(20, 20, 350, 300);
        t.setEditable(false);
     

        
        t.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ae) {
                String btn;
                int keyCode = ae.getKeyCode(); 
                switch (keyCode) {
                    case KeyEvent.VK_F1:
                        btn = "F1 Pressed";
                        break;
                    case KeyEvent.VK_F2:
                        btn = "F2 Pressed";
                        break;
                    case KeyEvent.VK_F3:
                        btn = "F3 Pressed";
                        break;
                    case KeyEvent.VK_PAGE_UP:
                        btn = "Page Up Pressed";
                        break;
                    case KeyEvent.VK_PAGE_DOWN:
                        btn = "Page Down Pressed";
                        break;
                    default:
                        btn = "Unknown Key";
                }
                t.append("Key Pressed: " + btn + "\n");
            }
        });

        add(t);

        setVisible(true);
    }

    public static void main(String[] args) {
        new KeyAction();
    }
}
