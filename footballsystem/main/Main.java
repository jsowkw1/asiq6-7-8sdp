package footballsystem.main;

import footballsystem.subject.FootballMatch;
import footballsystem.observer.*;

public class Main {
    public static void main(String[] args) {
        FootballMatch match = new FootballMatch();

        MatchObserver fan1 = new Fan("Mukha");
        MatchObserver fan2 = new Fan("Nurla");
        MatchObserver coach = new Coach();
        MatchObserver media = new MediaDisplay();

        match.addObserver(fan1);
        match.addObserver(fan2);
        match.addObserver(coach);
        match.addObserver(media);

        match.setScore("Team A 1 - 0 Team B");
        match.setScore("Team A 2 - 1 Team B");
    }
}
