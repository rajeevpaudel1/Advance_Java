import javax.swing.*;
import java.awt.*;

public class radio {
    public static void main(String[] args) {
        JFrame frame =new JFrame();
        frame.setBounds(100,100,500,400);
        frame.setLayout(null);
        frame.setVisible(true);
        Container C= frame.getContentPane();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //radio buttons
        JToggleButton r1 =new JToggleButton("Male");
        r1.setBounds(100,100,100,20);
        C.add(r1);

        JToggleButton r2 =new JToggleButton("Female");
        r2.setBounds(200,100,100,20);
        C.add(r2);


        //action implementation
        r1.addActionListener(e -> {
            if (r1.isSelected()){
                C.setBackground(Color.red);
            }
            else {
                C.setBackground(null);
            }
        });



    }
}
