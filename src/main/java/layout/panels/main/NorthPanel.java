package layout.panels.main;

import controller.Controller;
import layout.items.ComboBox;
import layout.items.NextButton;
import layout.items.PrevButton;
import layout.items.TextField;

import javax.swing.*;
import java.awt.*;

public class NorthPanel extends JPanel {
    public NorthPanel() {
        setLayout(new FlowLayout());
        add(new PrevButton());
        Controller controller = Controller.getInstance();
        TextField textField = new TextField();
        add(textField);
        controller.registerObserver(textField);
        add(new NextButton());
        add(new ComboBox());
    }
}
