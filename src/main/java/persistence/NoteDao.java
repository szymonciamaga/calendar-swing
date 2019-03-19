package persistence;

import java.time.LocalDate;
import java.util.List;

public interface NoteDao {
    void saveNote(String note, LocalDate date);
    List<String> getAllNotesForDay(LocalDate date);
}
