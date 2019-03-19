package layout.items;

import controller.Controller;
import view.ActualView;

import javax.swing.*;

public class ComboBox extends JComboBox<ActualView> {
    private static final ActualView[] OPTIONS = ActualView.values();
    private Controller instance = Controller.getInstance();

    public ComboBox() {
        super(OPTIONS);
        setSelectedIndex(1);
        addActionListener(event -> {
            instance.setActualView((ActualView) this.getSelectedItem());
        });
    }
}
