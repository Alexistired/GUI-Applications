// ColorFactoryPanel.java
import javax.swing.*;
import java.awt.*;

public class ColorFactoryPanel extends JPanel {
    public ColorFactoryPanel() {
        setLayout(new BorderLayout());

        JPanel topPanel = new TopPanel();
        JPanel bottomPanel = new BottomPanel();
        JLabel label = new JLabel("Top buttons change the panel color and bottom radio buttons change the text color.");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        add(topPanel, BorderLayout.NORTH);
        add(bottomPanel, BorderLayout.SOUTH);
        add(label, BorderLayout.CENTER);
    }
}
