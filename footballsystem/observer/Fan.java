package footballsystem.observer;

public class Fan implements MatchObserver {
    private String name;

    public Fan(String name) {
        this.name = name;
    }

    @Override
    public void update(String score) {
        System.out.println(name + " cheers: The new score is " + score + "!");
    }
}
