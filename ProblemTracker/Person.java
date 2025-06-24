package ProblemTracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Person {
        private static List<Problem> database  = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of your problem");
        String name = input.nextLine();
        System.out.println("Enter the problem type");
        ProblemType type = ProblemType.valueOf(input.nextLine());
        addProblem(name, type);


        System.out.println("Enter the name of the problem to change its status to resolved");
        String problemName = input.nextLine();
        changeStatus(problemName);
    }

    static void addProblem(String name, ProblemType type) {
        database.add(new Problem(name,type));

    }

    static void changeStatus(String name) {
        for (Problem problem : database) {
            if (problem.getName().equals(name)) {
                problem.setStatus(true);
                System.out.println("Status changed to resolved for problem: " + name);
                return;
            }
        }
        System.out.println("Problem not found: " + name);

    }

}




