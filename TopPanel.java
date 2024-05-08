// TopPanel.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TopPanel extends JPanel {
    public TopPanel() {
        setBackground(Color.WHITE);
        setLayout(new FlowLayout());

        JButton redButton = createButton("Red", Color.RED);
        JButton orangeButton = createButton("Orange", Color.ORANGE);
        JButton yellowButton = createButton("Yellow", Color.YELLOW);

        add(redButton);
        add(orangeButton);
        add(yellowButton);
    }

    private JButton createButton(String label, Color color) {
        JButton button = new JButton(label);
        button.setBackground(color);
        button.setActionCommand(label.substring(0, 1));
        button.addActionListener(new ButtonListener());
        return button;
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            switch (command) {
                case "R":
                    getParent().setBackground(Color.RED);
                    break;
                case "O":
                    getParent().setBackground(Color.ORANGE);
                    break;
                case "Y":
                    getParent().setBackground(Color.YELLOW);
                    break;
            }
        }
    }
}
