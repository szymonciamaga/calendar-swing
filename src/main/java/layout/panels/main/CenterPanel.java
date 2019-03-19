package layout.panels.main;

import controller.Controller;
import observer.observers.date.DateObserver;
import observer.observers.view.ViewObserver;
import view.ActualView;
import view.ContentGenerator;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;

public class CenterPanel extends JPanel implements DateObserver, ViewObserver {
    private ContentGenerator generator = new ContentGenerator();

    public CenterPanel() {
        setLayout(new GridLayout(2, 7));
        Controller controller = Controller.getInstance();
        controller.registerObserver((DateObserver) this);
        controller.registerObserver((ViewObserver) this);
        displayView();
    }

    @Override
    public void update(LocalDate date) {
        displayView();
    }

    @Override
    public void update(ActualView date) {
        displayView();
    }

    private void displayView() {
        removeAll();
        generator.getContent().forEach(this::add);
        revalidate();
        updateUI();
    }
}
