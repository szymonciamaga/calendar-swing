package layout.frames;

import layout.panels.note.FormPanel;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;

public class NoteFrame extends JFrame {
    public NoteFrame(LocalDate date) throws HeadlessException {
        JFrame noteFrame = new JFrame("Note");
        noteFrame.setSize(500, 700);
        noteFrame.setLocation(50, 50);
        noteFrame.setVisible(true);
        noteFrame.getContentPane().add(new FormPanel(date));
    }
}
