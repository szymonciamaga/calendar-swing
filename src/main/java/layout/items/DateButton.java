package layout.items;

import service.MouseEventListener;

import javax.swing.*;

public class DateButton extends JButton {

    public DateButton(String date) {
        setText(date);
        addMouseListener(new MouseEventListener(date));
    }
}
