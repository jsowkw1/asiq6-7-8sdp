package footballsystem.interfaces;

import footballsystem.observer.MatchObserver;

public interface MatchSubject {
    void addObserver(MatchObserver observer);
    void removeObserver(MatchObserver observer);
    void notifyObservers();
}
