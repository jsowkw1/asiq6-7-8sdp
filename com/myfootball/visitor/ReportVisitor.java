package com.myfootball.visitor;

import com.myfootball.elements.Player;
import com.myfootball.elements.Coach;
import com.myfootball.elements.Team;
import com.myfootball.dto.Report;

public class ReportVisitor implements Visitor {

    private final StringBuilder builder = new StringBuilder();

    @Override
    public void visitPlayer(Player player) {
        builder.append(String.format("Player: %s, #%d, %s, salary=%.2f%n",
                player.getName(), player.getNumber(), player.getPosition(), player.getSalary()));
    }

    @Override
    public void visitCoach(Coach coach) {
        builder.append(String.format("Coach: %s, role=%s, salary=%.2f%n",
                coach.getName(), coach.getRole(), coach.getSalary()));
    }

    @Override
    public void visitTeam(Team team) {
        builder.append(String.format("Team: %s%n", team.getName()));
    }

    public Report getReport() {
        return new Report(builder.toString());
    }
}
