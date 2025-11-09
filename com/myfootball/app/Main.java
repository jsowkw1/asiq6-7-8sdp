package com.myfootball.app;

import com.myfootball.elements.*;
import com.myfootball.visitor.*;
import com.myfootball.dto.Report;

public class Main {

    public static void main(String[] args) {
        Team team = new Team("Astana Eagles");

        Player p1 = new Player("A. Nurlybek", "Forward", 9, 1200.0);
        Player p2 = new Player("B. Saken", "Midfielder", 8, 1100.0);
        Coach headCoach = new Coach("S. Yermek", "Head coach", 2000.0);

        team.addMember(headCoach);
        team.addMember(p1);
        team.addMember(p2);

        ReportVisitor reportVisitor = new ReportVisitor();
        team.accept(reportVisitor);
        Report report = reportVisitor.getReport();
        System.out.println("=== Team Report ===");
        System.out.println(report);

        SalaryVisitor salaryVisitor = new SalaryVisitor();
        team.accept(salaryVisitor);
        System.out.printf("Total payroll: %.2f%n", salaryVisitor.getTotalSalary());
    }
}
