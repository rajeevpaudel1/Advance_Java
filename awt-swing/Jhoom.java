import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Myframe extends JFrame implements ActionListener{
    Container c;
    JButton btn;
    Myframe(){
        c=this.getContentPane();
        c.setLayout(null);

        btn =new JButton("Click me");
        btn.setBounds(100,100,100,20);
        c.add(btn);
        btn.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        c.setBackground(Color.red);

    }
}
public class Jhoom {
    public static void main() {
        Myframe f=new Myframe();
        f.setTitle("Action Demo");
        f.setBounds(100,100,500,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(Myframe.EXIT_ON_CLOSE);
    }
}
