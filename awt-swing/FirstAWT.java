import java.awt.*;

public class FirstAWT {
    public static void main(String[] args) {

        Frame f = new Frame("First AWT Program");

        Button b = new Button("Click Me");

        b.setBounds(100, 100, 100, 40);

        f.add(b);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

    }
}