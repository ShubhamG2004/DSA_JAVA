import java.awt.*;
import java.awt.event.*;

public class ShapeFiller extends Frame {

    public ShapeFiller() {
       
        setTitle("Shape Filler");
        setSize(400, 400);
        setVisible(true);

      
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        
        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 50);

        g.setColor(Color.BLUE);
        g.fillOval(200, 50, 100, 50);

        g.setColor(Color.GREEN);
        g.fillOval(50, 150, 50, 50);

       
        g.setColor(Color.YELLOW);
        g.fillRect(200, 150, 100, 100);
    }

    public static void main(String[] args) {
        new ShapeFiller();
    }
}
