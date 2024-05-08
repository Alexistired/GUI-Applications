// ColorFactory.java
import javax.swing.*;

public class ColorFactory {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ColorFactoryFrame frame = new ColorFactoryFrame();
            frame.setVisible(true);
        });
    }
}
