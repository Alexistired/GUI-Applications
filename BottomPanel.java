// BottomPanel.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BottomPanel extends JPanel {
    public BottomPanel() {
        setBackground(Color.WHITE);
        setLayout(new FlowLayout());

        JRadioButton greenRadio = createRadioButton("Green", Color.GREEN);
        JRadioButton blueRadio = createRadioButton("Blue", Color.BLUE);
        JRadioButton cyanRadio = createRadioButton("Cyan", Color.CYAN);

        ButtonGroup group = new ButtonGroup();
        group.add(greenRadio);
        group.add(blueRadio);
        group.add(cyanRadio);

        add(greenRadio);
        add(blueRadio);
        add(cyanRadio);
    }

    private JRadioButton createRadioButton(String label, Color color) {
        JRadioButton radioButton = new JRadioButton(label);
        radioButton.setForeground(color);
        radioButton.setActionCommand(label);
        radioButton.addActionListener(new RadioButtonListener());
        return radioButton;
    }

    private class RadioButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            ColorFactoryPanel colorFactoryPanel = (ColorFactoryPanel) getParent();
            Component[] components = colorFactoryPanel.getComponents();
            for (Component component : components) {
                if (component instanceof JLabel) {
                    JLabel label = (JLabel) component;
                    switch (command) {
                        case "Green":
                            label.setForeground(Color.GREEN);
                            break;
                        case "Blue":
                            label.setForeground(Color.BLUE);
                            break;
                        case "Cyan":
                            label.setForeground(Color.CYAN);
                            break;
                    }
                    break; 
                }
            }
        }
    }
}