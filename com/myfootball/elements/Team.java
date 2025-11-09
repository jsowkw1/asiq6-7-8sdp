package com.myfootball.elements;

import com.myfootball.visitor.Visitor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class Team implements Visitable {
    private final String name;
    private final List<Visitable> members;

    public Team(String name) {
        this.name = Objects.requireNonNull(name);
        this.members = new ArrayList<>();
    }

    public String getName() { return name; }

    public void addMember(Visitable member) {
        members.add(Objects.requireNonNull(member));
    }

    public List<Visitable> getMembers() {
        return Collections.unmodifiableList(members);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTeam(this);
        for (Visitable member : members) {
            member.accept(visitor);
        }
    }
}
