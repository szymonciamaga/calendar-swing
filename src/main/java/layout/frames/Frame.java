package layout.frames;

import layout.panels.main.CenterPanel;
import layout.panels.main.NorthPanel;

import javax.swing.*;

public class Frame extends JFrame {
    public Frame() {
        JFrame frame = new JFrame("Calendar");
        frame.setSize(5500, 700);
        frame.getContentPane().add(new NorthPanel(), "North");
        frame.getContentPane().add(new CenterPanel(), "Center");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(50, 50);
        frame.setVisible(true);
    }
}
