package com.myfootball.visitor;

import com.myfootball.elements.Player;
import com.myfootball.elements.Coach;
import com.myfootball.elements.Team;

public class SalaryVisitor implements Visitor {

    private double totalSalary = 0.0;

    @Override
    public void visitPlayer(Player player) {
        totalSalary += player.getSalary();
    }

    @Override
    public void visitCoach(Coach coach) {
        totalSalary += coach.getSalary();
    }

    @Override
    public void visitTeam(Team team) {
    }

    public double getTotalSalary() {
        return totalSalary;
    }
}
