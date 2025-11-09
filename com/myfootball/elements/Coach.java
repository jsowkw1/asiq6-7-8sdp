package com.myfootball.elements;

import com.myfootball.visitor.Visitor;
import java.util.Objects;

public final class Coach implements Visitable {
    private final String name;
    private final String role;
    private final double salary;

    public Coach(String name, String role, double salary) {
        this.name = Objects.requireNonNull(name);
        this.role = Objects.requireNonNull(role);
        this.salary = salary;
    }

    public String getName() { return name; }
    public String getRole() { return role; }
    public double getSalary() { return salary; }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCoach(this);
    }
}
