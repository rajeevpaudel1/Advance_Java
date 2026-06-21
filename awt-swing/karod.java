import javax.swing.*;
import java.awt.*;

public class karod {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setBounds(100,100,600,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Menu Wala Application");
        frame.setLayout(null);
        Container C =frame.getContentPane();

        JMenuBar mb =new JMenuBar();
        mb.setBounds(0,0,600,50);
        C.add(mb);

        JMenu f=new JMenu("File");
        mb.add(f);
        JMenu e=new JMenu("Edit");
        mb.add(e);
        JMenu v=new JMenu("View");
        mb.add(v);

        // files-items
        JMenuItem f1 =new JMenuItem("Open");
        e.add(f1);
        JMenuItem f2 =new JMenuItem("Recent");
        e.add(f2);
        JMenuItem f3 =new JMenuItem("save");
        e.add(f3);
        JMenu f4 =new JMenu("save as");
        e.add(f4);

        //Save As- Extended
        JMenuItem f41 =new JMenuItem("TXT");
        JMenuItem f42 =new JMenuItem("PDF");
        f4.add(f41);
        f4.add(f42);


        // Edit-items
        JMenuItem e1 =new JMenuItem("Undo");
        f.add(e1);
        JMenuItem e2 =new JMenuItem("Cut");
        f.add(e2);
        JMenuItem e3 =new JMenuItem("Copy");
        f.add(e3);
        JMenuItem e4 =new JMenuItem("Paste");
        f.add(e4);

        //

    }
}
