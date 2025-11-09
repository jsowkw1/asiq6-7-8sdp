package com.myfootball.visitor;

import com.myfootball.elements.Player;
import com.myfootball.elements.Coach;
import com.myfootball.elements.Team;

public interface Visitor {
    void visitPlayer(Player player);
    void visitCoach(Coach coach);
    void visitTeam(Team team);
}
