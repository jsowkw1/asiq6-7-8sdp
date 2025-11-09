package com.myfootball.elements;

import com.myfootball.visitor.Visitor;
import java.util.Objects;

public final class Player implements Visitable {
    private final String name;
    private final String position;
    private final int number;
    private final double salary;

    public Player(String name, String position, int number, double salary) {
        this.name = Objects.requireNonNull(name);
        this.position = Objects.requireNonNull(position);
        this.number = number;
        this.salary = salary;
    }

    public String getName() { return name; }
    public String getPosition() { return position; }
    public int getNumber() { return number; }
    public double getSalary() { return salary; }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitPlayer(this);
    }
}
