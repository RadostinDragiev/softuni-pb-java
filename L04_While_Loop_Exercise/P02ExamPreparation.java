package L04_While_Loop_Exercise;

import java.util.Scanner;

public class P02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int unsasisfactoryGrades = Integer.parseInt(scanner.nextLine());
        String problem = scanner.nextLine();

        double resultSum = 0;
        int numberOfProblems = 0;
        int unsasisfactoryGradesCounter = 0;
        String lastProblem = "";

        while (!problem.equals("Enough")) {
            int result = Integer.parseInt(scanner.nextLine());
            numberOfProblems++;
            resultSum += result;

            if (result <= 4) {
                unsasisfactoryGradesCounter++;
                if (unsasisfactoryGradesCounter == unsasisfactoryGrades) {
                    System.out.printf("You need a break, %d poor grades.", unsasisfactoryGradesCounter);
                    break;
                }
            }
            lastProblem = problem;
            problem = scanner.nextLine();
        }

        double averageSum = resultSum / numberOfProblems * 1.0;

        if (problem.equals("Enough")) {
            System.out.printf("Average score: %.2f%n", averageSum);
            System.out.printf("Number of problems: %d%n", numberOfProblems);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}
