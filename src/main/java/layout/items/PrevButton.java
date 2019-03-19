package layout.items;

import controller.Controller;
import javafx.util.Pair;

import javax.swing.*;
import java.time.LocalDate;

public class PrevButton extends JButton {
    private Controller instance = Controller.getInstance();

    public PrevButton() {
        setText("<");
        addActionListener(event -> {
            LocalDate date = instance.getCurrentDate();
            Pair<LocalDate, Integer> features = instance.getActualView().getValues(date);
            instance.setCurrentDate(instance.getCurrentDate().minusDays(features.getValue()));
        });
    }
}
