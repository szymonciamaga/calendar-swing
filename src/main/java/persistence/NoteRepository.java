package persistence;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NoteRepository implements NoteDao {
    private final static NoteDao instance = new NoteRepository();
    private final Map<LocalDate, List<String>> notes = new HashMap<>();

    private NoteRepository() {}

    @Override
    public void saveNote(String note, LocalDate date) {
        List<String> allNotes = notes.getOrDefault(date, new ArrayList<>());
        allNotes.add(note);
        notes.put(date, allNotes);
    }

    @Override
    public List<String> getAllNotesForDay(LocalDate date) {
        return notes.getOrDefault(date, new ArrayList<>());
    }

    public static NoteDao getInstance() {
        return instance;
    }
}
