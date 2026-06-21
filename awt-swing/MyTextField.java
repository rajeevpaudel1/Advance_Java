import javax.swing.*;
import java.awt.*;

public class MyTextField {
    public static void main() {
        JFrame frame =new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,500,400);
        Container c= frame.getContentPane();
        c.setLayout(null);

        //background color
        c.setBackground(Color.gray);

        //label-name
        JLabel label= new JLabel("Name");
        label.setBounds(50,158,50,10);
        c.add(label);

        //textfield-name
        JTextField t1=new JTextField();
        t1.setBounds(120,150,100,30);
        c.add(t1);

        //label-Password
        JLabel label1= new JLabel("Password");
        label1.setBounds(40,200,100,10);
        c.add(label1);

        //textfield-Password
        JTextField t2=new JTextField();
        t2.setBounds(120,200,100,30);
        c.add(t2);

        //button
        JButton button=new JButton("Submit");
        button.setBounds(120,250,80,25);
        c.add(button);

        frame.setVisible(true);


    }
}
