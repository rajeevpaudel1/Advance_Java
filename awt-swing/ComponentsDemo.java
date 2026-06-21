import javax.swing.*;

public class ComponentsDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Components Demo");
        JLabel label = new JLabel("Enter Name:");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField text = new JTextField();
        JButton button = new JButton("Submit");
        label.setBounds(50, 50, 100, 30);
        text.setBounds(150, 50, 150, 30);
        button.setBounds(100, 120, 100, 40);
        frame.add(label);
        frame.add(text);
        frame.add(button);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}