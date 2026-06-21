import javax.swing.*;
import java.awt.*;

public class Suru {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(700,500);
//        frame.setLocation(100,50);
        frame.setBounds(100,100,900,600);
        frame.setTitle("Boom");
        ImageIcon icon=new ImageIcon("avatar.png");
        frame.setIconImage(icon.getImage());

        Container C =frame.getContentPane();
        C.setBackground(Color.red);

    }
}
