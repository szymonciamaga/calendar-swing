package observer.observers.date;

import java.time.LocalDate;

public interface DateObserver {
    void update(LocalDate date);
}
