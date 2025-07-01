package ProblemTracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Person {
        private static List<Problem> database  = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("");
            String mainMenuDisplay = """
                    Welcome to the Problem Tracker!
                    1. Add a new problem
                    2. Change problem status to resolved
                    3. View all unsolved problems
                    4. Exit                    """;
            System.out.println(mainMenuDisplay);
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the name of your problem");
                    String name = input.next();
                    System.out.println("Available problem types: BUSINESS, EDUCATIONAL, FINANCIAL, SPIRITUAL, TECHNICAL");
                    System.out.println("Enter the problem type");
                    ProblemType type = ProblemType.valueOf(input.next().toUpperCase());
                    addProblem(name, type);
                    break;

                case 2:
                    System.out.println("Enter the name of the problem to change its status to resolved");
                    String problemName = input.next();
                    changeStatus(problemName);
                    break;

                case 3:
                    System.out.println("\nUnsolved Problems:");
                    for (Problem problem : database) {
                        if (!problem.getStatus()) {
                            System.out.println("Problem Name: " + problem.getName() + ", Type: " + problem.getType());
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting the Problem Tracker. Goodbye!");
                    input.close();
                    return;
            }
        }
    }
    static void addProblem(String name, ProblemType type) {
        database.add(new Problem(name,type));

    }

    static void changeStatus(String name) {
        for (Problem problem : database) {
            if (problem.getName().equals(name)) {
                problem.setStatus();
                System.out.println("Status changed to resolved for problem: " + name);
                return;
            }
        }
        System.out.println("Problem not found: " + name);

    }

}




