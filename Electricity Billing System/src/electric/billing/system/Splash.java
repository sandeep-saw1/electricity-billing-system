package electric.billing.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {
    Splash() {

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/Splash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        setSize(600, 400);
        setLocation(300, 200);
        setVisible(true);

        try {
            Thread.sleep(3000);
            setVisible(false);
            new Login();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public static void main(String[] args) {
        new Splash();
    }
}
