import javax.swing.*;
import java.awt.*;

public class AppletDemo extends JApplet {

    @Override
    public void init() {
        // Setting up the layout
        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        // North Panel with Icons and Labels
        JPanel northPanel = new JPanel();
        JLabel iconLabel = new JLabel("Icon and Label Example", new ImageIcon("icon.png"), JLabel.CENTER);
        northPanel.add(iconLabel);

        // Center Panel with Text Fields, Buttons, Combo Boxes, and Checkboxes
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(3, 2, 10, 10));

        // Adding Text Field
        centerPanel.add(new JLabel("Enter Text:"));
        JTextField textField = new JTextField(15);
        centerPanel.add(textField);

        // Adding Button
        JButton button = new JButton("Submit");
        centerPanel.add(button);

        // Adding Combo Box
        centerPanel.add(new JLabel("Select Option:"));
        JComboBox<String> comboBox = new JComboBox<>(new String[]{"Option 1", "Option 2", "Option 3"});
        centerPanel.add(comboBox);

        // Adding Checkboxes
        centerPanel.add(new JLabel("Choose:"));
        JPanel checkboxPanel = new JPanel();
        JCheckBox checkbox1 = new JCheckBox("Option A");
        JCheckBox checkbox2 = new JCheckBox("Option B");
        checkboxPanel.add(checkbox1);
        checkboxPanel.add(checkbox2);
        centerPanel.add(checkboxPanel);

        // Adding Tabbed Pane
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Tab 1", new JLabel("Content of Tab 1"));
        tabbedPane.addTab("Tab 2", new JLabel("Content of Tab 2"));

        // Adding Scroll Pane
        JTextArea textArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Adding components to the main container
        container.add(northPanel, BorderLayout.NORTH);
        container.add(centerPanel, BorderLayout.CENTER);
        container.add(tabbedPane, BorderLayout.SOUTH);
        container.add(scrollPane, BorderLayout.EAST);
    }
}
