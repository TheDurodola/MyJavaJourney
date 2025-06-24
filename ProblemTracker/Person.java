package ProblemTracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Person {

    public static void main(String[] args) {
        List<Problem> database  = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of your problem: ");
        String name = input.nextLine();

        System.out.println("\nPick a Problem Type;");
        int index = 1;
        for(ProblemType problemType : ProblemType.values()){
            System.out.println(index + ". " + problemType);
            index++;
        }

        System.out.print("\nType your problem type : ");
        String type = input.nextLine();

        ProblemType problemType = ProblemType.valueOf(type.toUpperCase());
        Problem problem = new Problem(name, problemType);
        database.add(problem);


        System.out.println(database.get(0).toString());
    }

}
