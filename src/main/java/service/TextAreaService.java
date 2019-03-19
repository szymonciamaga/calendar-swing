package service;

import controller.Controller;
import layout.items.TextField;
import util.Const;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class TextAreaService implements KeyListener {
    private Controller instance = Controller.getInstance();
    private TextField textField;

    public TextAreaService(TextField textField) {
        this.textField = textField;
    }

    @Override
    public void keyTyped(KeyEvent event) {

    }

    @Override
    public void keyPressed(KeyEvent event) {

    }

    @Override
    public void keyReleased(KeyEvent event) {
        if (event.getKeyCode() == Const.ASCII_ENTER_KEY) {
            try {
                instance.setCurrentDate(LocalDate.parse(textField.getText()));
            } catch (DateTimeParseException e) {
                textField.setText(String.valueOf(Controller.getInstance().getCurrentDate()));
                JOptionPane.showMessageDialog(textField, "Incorrect date format correct format is yyyy-mm-dd",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
