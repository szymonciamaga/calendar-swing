package layout.items;

import controller.Controller;
import observer.observers.date.DateObserver;
import service.TextAreaService;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;

public class TextField extends JTextField implements DateObserver {

    public TextField() {
        Controller instance = Controller.getInstance();
        setColumns(6);
        setFont(new Font("Serif", Font.ITALIC, 25));
        setPreferredSize(new Dimension(150, 30));
        setText(instance.getCurrentDate().toString());
        addKeyListener(new TextAreaService(this));
    }

    @Override
    public void update(LocalDate date) {
        setText(date.toString());
    }
}
