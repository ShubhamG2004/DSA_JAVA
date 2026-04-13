import java.awt.*;
import java.awt.event.*;

public class AwtExample extends Frame implements ActionListener {
	Label l;
    public AwtExample() {
        Button b = new Button("Click Me!");
        b.setBounds(20, 30, 80, 30);
		
		l =new Label();
		l.setBounds(30,80,80,70);

        add(b);
		add(l);

        b.addActionListener(this);

        setSize(300, 300);
        setLayout(null);
        setTitle("AwtExample");
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        l.setText("Button Clicked!!!");
    }

    public static void main(String args[]) {
        new AwtExample();
    }
}