import javax.swing.*;
import java.awt.*;

public class lakh {
    public static void main() {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setBounds(100,100,600,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Menu Application");
        Container C = frame.getContentPane();
        frame.setLayout(null);

        //Setting the menubar
        JMenuBar menuBar =new JMenuBar();
        menuBar.setBounds(0,0,600,30);
        C.add(menuBar);

        //setting the menu
        JMenu file=new JMenu("File");
        menuBar.add(file);
        JMenu edit=new JMenu("Edit");
        menuBar.add(edit);
        JMenu view=new JMenu("View");
        menuBar.add(view);

        //setting the menu items for file
        JMenuItem open =new JMenuItem("Open");
        file.add(open);
        JMenuItem recent= new JMenuItem("Recent");
        file.add(recent);
        JMenuItem save =new JMenuItem("Save");
        file.add(save);
        JMenu saveas =new JMenu("Save As");
        file.add(saveas);

        //Extending the saveas
        JMenuItem pdf =new JMenuItem("PDF");
        saveas.add(pdf);


        //setting the menu items for Edit
        JMenuItem undo =new JMenuItem("Undo");
        edit.add(undo);
        JMenuItem cut =new JMenuItem("Cut");
        edit.add(cut);
        JMenuItem copy =new JMenuItem("Copy");
        edit.add(copy);
        JMenuItem paste =new JMenuItem("Paste");
        edit.add(paste);

    }


}
