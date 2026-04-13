import javax.swing.*;
import java.awt.event.*;

class JmenuEx {
    JmenuEx() {
        JFrame f = new JFrame("Language Selection");
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar jb = new JMenuBar();

        JMenu languageMenu = new JMenu("Languages");

        String[] languages = {"Java", "Python", "C++", "JavaScript", "PHP"};

        JLabel selectedLabel = new JLabel("Selected Language: None");

        for (String language : languages) {
            JMenuItem menuItem = new JMenuItem(language);
            languageMenu.add(menuItem);
            menuItem.addActionListener(e -> selectedLabel.setText("Selected Language: " + language));
        }

        jb.add(languageMenu);

        f.setJMenuBar(jb);
        f.add(selectedLabel);

        f.setVisible(true);
    }

    public static void main(String args[]) {
        new JmenuEx();
    }
}
