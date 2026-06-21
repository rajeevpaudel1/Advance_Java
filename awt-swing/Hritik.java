import javax.swing.*;
import java.awt.*;

public class Hritik {
    static void main() {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setBounds(100,100,600,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("First Application");
        JButton button=new JButton("Click Me");
        button.setBounds(100,100,180,20);
        frame.add(button);
        frame.setLayout(null);
        JLabel label=new JLabel("Hello World");

        label.setBounds(100,150,100,40);
        frame.add(label);


    }

}
