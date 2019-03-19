package view;

import controller.Controller;
import javafx.util.Pair;
import layout.items.DateButton;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContentGenerator {
    private Controller instance = Controller.getInstance();

    public List<DateButton> getContent() {
        List<DateButton> dateButtonsList = new ArrayList<>();
        LocalDate current = instance.getCurrentDate();
        Pair<LocalDate, Integer> features = instance.getActualView().getValues(current);
        for (int i = 0; i < features.getValue(); i++) {
            LocalDate date = features.getKey().plusDays(i);
            DateButton dateButton = new DateButton(date.toString());
            if (date.toString().equals(instance.getCurrentDate().toString()))
                dateButton.setBackground(Color.LIGHT_GRAY);
            dateButtonsList.add(dateButton);
        }
        return dateButtonsList;
    }
}
