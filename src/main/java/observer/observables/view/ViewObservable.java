package observer.observables.view;

import observer.observers.view.ViewObserver;

public interface ViewObservable {
    void registerObserver(ViewObserver observer);
    void unregisterObserver(ViewObserver observer);
    void notifyViewObservers();
}
