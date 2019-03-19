package layout.items;

import persistence.NoteDao;
import persistence.NoteRepository;

import javax.swing.*;
import java.time.LocalDate;

public class NotesList extends JPanel {
    private NoteDao instance = NoteRepository.getInstance();

    public NotesList(LocalDate date) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        instance.getAllNotesForDay(date).forEach(note -> add(new NoteLabel(note)));
    }
}
