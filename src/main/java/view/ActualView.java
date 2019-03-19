package view;

import javafx.util.Pair;
import util.Const;

import java.time.DayOfWeek;
import java.time.LocalDate;

public enum ActualView {

    MONTH {
        @Override
        public Pair<LocalDate, Integer> getValues(LocalDate date) {
            LocalDate day = date.withDayOfMonth(1);
            int month = day.lengthOfMonth();
            return new Pair<>(day, month);
        }
    },
    WEEK {
        @Override
        public Pair<LocalDate, Integer> getValues(LocalDate date) {
            LocalDate monday = date.with(DayOfWeek.MONDAY);
            return new Pair<>(monday, Const.DAYS_A_WEEK);
        }
    };

    public abstract Pair<LocalDate, Integer> getValues(LocalDate date);
}
