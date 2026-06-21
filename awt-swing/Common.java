import javax.swing.*;
import java.awt.*;


public class Common {
    public static void main() {
        JFrame frame = new JFrame();
        frame.setBounds(100, 100, 500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container C = frame.getContentPane();
        frame.setLayout(null);

        //background

        //Login Text
//        JLabel l1 =new JLabel("Login Form");
//        l1.setBounds(220,50,100,30);
//        C.add(l1);

        //name
//        JLabel l2 =new JLabel("Name:");
//        l2.setBounds(150,100,100,30);
//        C.add(l2);

        //password
//        JLabel l3 =new JLabel("Password:");
//        l3.setBounds(150,130,100,30);
//        C.add(l3);

        //Name-textfield
        JTextField t1 = new JTextField();
        t1.setBounds(250, 100, 100, 25);
//
        C.add(t1);

        //Password-field
        JPasswordField t2 = new JPasswordField();
        t2.setBounds(250, 130, 100, 30);
        C.add(t2);

        //label
        JLabel l3 = new JLabel("The sum is :");
        l3.setBounds(250, 170, 100, 30);
        C.add(l3);

        //button
        JButton b1 = new JButton("Sum");
        b1.setBounds(250, 200, 80, 30);
        C.add(b1);

        frame.setVisible(true);


    }

}
