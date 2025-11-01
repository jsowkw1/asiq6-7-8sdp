package footballsystem.observer;

public class Coach implements MatchObserver {
    @Override
    public void update(String score) {
        System.out.println("Coach analyzes the new score: " + score);
    }
}
