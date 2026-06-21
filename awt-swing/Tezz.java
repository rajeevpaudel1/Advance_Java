import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Tezz {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(100, 100, 500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Information Form");

        Container c = frame.getContentPane();
        c.setLayout(null);

        // First Number TextField
        JTextField t1 = new JTextField();
        t1.setBounds(220, 100, 100, 30);
        c.add(t1);

        // Second Number TextField
        JPasswordField t2 = new JPasswordField();
        t2.setBounds(220, 150, 100, 30);
        c.add(t2);

        // Add Button
        JButton b1 = new JButton("Submit");
        b1.setBounds(180, 220, 100, 30);
        c.add(b1);

        // Result Label

        // Button Action
       b1.addActionListener(e -> {
           String a= t1.getText();
           String b= t2.getText();

           System.out.println("Name:"+a);
           System.out.println("Password:"+b);

       });
        frame.setVisible(true);
    }
}