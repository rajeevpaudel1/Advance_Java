import javax.swing.*;

public class RAJESH {
    static void main() {
        JFrame frame =new JFrame();
        frame.setVisible(true);
        frame.setBounds(100,100,500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("First Application");

        JButton button=new JButton("Submit");
        button.setBounds(100,100,100,50);
        frame.add(button);
    }

}
