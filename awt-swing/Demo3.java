import javax.swing.*;
import java.awt.*;

public class Demo3 {
    public static void main( String[] args) {
        JFrame frame =new JFrame();
        frame.setLayout(null);
        frame.setBounds(100,100,500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container C =frame.getContentPane();
        frame.setVisible(true);

        //creating a button
        JButton b1= new JButton("Red");
        b1.setBounds(200,180,100,50);
        C.add(b1);

        JButton b2= new JButton("White");
        b2.setBounds(200,250,100,50);
        C.add(b2);

        //creating the action
        b1.addActionListener(e -> {
            C.setBackground(Color.red);
        });

        b2.addActionListener(e -> {
            C.setBackground(Color.white);
        });

    }
}
