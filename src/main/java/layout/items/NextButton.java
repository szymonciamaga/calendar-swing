package layout.items;

import controller.Controller;
import javafx.util.Pair;

import javax.swing.*;
import java.time.LocalDate;

public class NextButton extends JButton {
    private Controller instance = Controller.getInstance();

    public NextButton() {
        setText(">");
        addActionListener(event -> {
            LocalDate date = instance.getCurrentDate();
            Pair<LocalDate, Integer> features = instance.getActualView().getValues(date);
            instance.setCurrentDate(instance.getCurrentDate().plusDays(features.getValue()));
        });
    }
}
