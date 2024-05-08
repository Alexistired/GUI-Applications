// ColorFactoryFrame.java
import javax.swing.*;
import java.awt.*;

public class ColorFactoryFrame extends JFrame {
    private static final int WIDTH = 500;
    private static final int HEIGHT = 300;

    public ColorFactoryFrame() {
        setTitle("Color Factory");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(new ColorFactoryPanel(), BorderLayout.CENTER);
    }
}
