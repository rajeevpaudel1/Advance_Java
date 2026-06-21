import javax.swing.*;
import java.awt.*;

public class Login {
    public static void main() {
        JFrame frame=new JFrame();
        frame.setBounds(100,100,500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Login Form");
        Container C =frame.getContentPane();
        C.setLayout(null);

        //background color
        C.setBackground(Color.lightGray);

        //Login Form Heading
        JLabel l1=new JLabel("Login Form");
        l1.setBounds(220,50,100,50);
        C.add(l1);

        //name
        JLabel l2=new JLabel("Name: ");
        l2.setBounds(100,100,100,50);
        C.add(l2);

        //password
        JLabel l3=new JLabel("Password: ");
        l3.setBounds(100,140,100,50);
        C.add(l3);

        //name-box
        JTextField t1= new JTextField();
        t1.setBounds(200,110,100,25);
        t1.setBackground(Color.BLACK);
        t1.setForeground(Color.WHITE);
        C.add(t1);

        //Password-box
        JPasswordField t2= new JPasswordField();
        t2.setBounds(200,150,100,25);
        C.add(t2);

        //button
        JButton b1=new JButton("Submit");
        b1.setBounds(200,200,100,30);
        C.add(b1);

        //Display the result in Console
        b1.addActionListener(e -> {
            String a= t1.getText();
            String b= t2.getText();
            System.out.println("Your name is: "+a);
            System.out.println("Your Password is: "+b);
        });
        frame.setVisible(true);
    }
}
