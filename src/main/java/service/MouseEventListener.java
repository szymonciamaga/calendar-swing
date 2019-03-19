package service;

import controller.Controller;
import layout.frames.NoteFrame;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;

public class MouseEventListener implements MouseListener {
    private Controller instance = Controller.getInstance();
    private String dateString;

    public MouseEventListener(String dateString) {
        this.dateString = dateString;
    }

    @Override
    public void mouseClicked(MouseEvent event) {
        LocalDate date = LocalDate.parse(dateString);
        if (SwingUtilities.isRightMouseButton(event)) {
            NoteFrame noteFrame = new NoteFrame(date);
        } else {
            instance.setCurrentDate(date);
        }
    }

    @Override
    public void mousePressed(MouseEvent event) {

    }

    @Override
    public void mouseReleased(MouseEvent event) {

    }

    @Override
    public void mouseEntered(MouseEvent event) {

    }

    @Override
    public void mouseExited(MouseEvent event) {

    }
}
