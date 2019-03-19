package layout.items;

import javax.swing.*;
import java.awt.*;

public class TextArea extends JTextArea {
    public TextArea() {
        setRows(15);
        setColumns(20);
        setFont(new Font("Serif", Font.ITALIC, 25));
        setPreferredSize(new Dimension(150, 30));
    }
}
