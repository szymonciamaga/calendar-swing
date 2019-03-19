package layout.panels.note;

import controller.Controller;
import layout.items.NotesList;
import layout.items.SaveButton;
import layout.items.TextArea;
import javax.swing.*;
import java.time.LocalDate;

public class FormPanel extends JPanel {
    private Controller instance = Controller.getInstance();
    private NotesList notesList;

    public FormPanel(LocalDate date) {
        TextArea noteArea = new TextArea();
        SaveButton saveButton = new SaveButton();
        add(noteArea);
        add(saveButton);
        saveButton.addActionListener(event -> {
            instance.getNoteDao().saveNote(noteArea.getText(), date);
            remove(notesList);
            noteArea.setText("");
            notesList = new NotesList(date);
            add(notesList);
        });
        notesList = new NotesList(date);
        add(notesList);
    }
}
