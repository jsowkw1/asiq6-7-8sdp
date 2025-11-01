package footballsystem.subject;

import footballsystem.interfaces.MatchSubject;
import footballsystem.observer.MatchObserver;
import java.util.ArrayList;
import java.util.List;

public class FootballMatch implements MatchSubject {
    private List<MatchObserver> observers = new ArrayList<>();
    private String score;

    public void setScore(String score) {
        this.score = score;
        System.out.println("Score updated: " + score);
        notifyObservers();
    }

    @Override
    public void addObserver(MatchObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(MatchObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (MatchObserver o : observers) {
            o.update(score);
        }
    }
}
