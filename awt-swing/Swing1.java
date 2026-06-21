import javax.swing.*;
public class Swing1 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("First Swing Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("Click Me");
        button.setBounds(100, 100, 120, 40);
        frame.add(button);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}