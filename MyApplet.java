import javax.swing.*;
import java.awt.*;

public class MyApplet extends JApplet {
    public void init() {
        setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter your name:");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Submit");
        String[] options = { "Option 1", "Option 2", "Option 3" };
        JComboBox<String> comboBox = new JComboBox<>(options);
        JCheckBox checkBox = new JCheckBox("Agree to terms");

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.add("Tab 1", new JPanel());
        tabbedPane.add("Tab 2", new JPanel());

        JTextArea textArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);

        add(label);
        add(textField);
        add(button);
        add(comboBox);
        add(checkBox);
        add(tabbedPane);
        add(scrollPane);
    }
}
