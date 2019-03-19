package observer.observables.date;


import observer.observers.date.DateObserver;

public interface DateObservable {
    void registerObserver(DateObserver observer);
    void unregisterObserver(DateObserver observer);
    void notifyDateObservers();
}
