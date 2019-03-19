package controller;

import observer.observables.date.DateObservable;
import observer.observers.date.DateObserver;
import observer.observables.view.ViewObservable;
import observer.observers.view.ViewObserver;
import persistence.NoteDao;
import persistence.NoteRepository;
import view.ActualView;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Controller implements DateObservable, ViewObservable {
    private final static Controller instance = new Controller();
    private LocalDate currentDate = LocalDate.now();
    private ActualView actualView = ActualView.WEEK;
    private Set<DateObserver> registeredDateObservers = new HashSet<>();
    private Set<ViewObserver> registeredViewObservers = new HashSet<>();
    private NoteDao noteDao = NoteRepository.getInstance();

    private Controller() {}

    public static Controller getInstance() {
        return instance;
    }

    @Override
    public void registerObserver(DateObserver observer) {
        registeredDateObservers.add(observer);
    }

    @Override
    public void unregisterObserver(DateObserver observer) {
        registeredDateObservers.remove(observer);
    }

    @Override
    public void registerObserver(ViewObserver observer) {
        registeredViewObservers.add(observer);
    }

    @Override
    public void unregisterObserver(ViewObserver observer) {
        registeredViewObservers.remove(observer);
    }

    @Override
    public void notifyViewObservers() {
        registeredViewObservers.forEach(viewObserver -> viewObserver.update(this.getActualView()));
    }

    @Override
    public void notifyDateObservers() {
        registeredDateObservers.forEach(dateObserver -> dateObserver.update(this.getCurrentDate()));
    }

    public LocalDate getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(LocalDate currentDate) {
        this.currentDate = currentDate;
        notifyDateObservers();
    }

    public ActualView getActualView() {
        return actualView;
    }

    public void setActualView(ActualView actualView) {
        this.actualView = actualView;
        notifyViewObservers();
    }

    public NoteDao getNoteDao() {
        return noteDao;
    }
}
