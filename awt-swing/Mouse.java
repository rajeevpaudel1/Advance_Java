//Changing the background color using buttons
import javax.swing.*;
import java.awt.*;

public class Mouse {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setBounds(100,100,500,400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container C =frame.getContentPane();

        JButton b1=new JButton("Red");
        b1.setBounds(200,200,100,40);
        C.add(b1);

        JButton b2=new JButton("White");
        b2.setBounds(200,100,100,40);
        C.add(b2);

        b1.addActionListener(e -> {
            C.setBackground(Color.red);
        });

        b2.addActionListener(e -> {
            C.setBackground(Color.white);
        });


    }
}
