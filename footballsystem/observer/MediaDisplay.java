package footballsystem.observer;

public class MediaDisplay implements MatchObserver {
    @Override
    public void update(String score) {
        System.out.println("Media displays: LIVE SCORE → " + score);
    }
}
