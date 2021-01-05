package L04_While_Loop_Exercise;

import java.util.Scanner;

public class P04Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int goalSteps = 10000;
        int countallSteps = 0;
        String command = scan.nextLine();

        while (!command.equals("Going home")) {
            int countSteps = Integer.parseInt(command);
            goalSteps -= countSteps;
            countallSteps += countSteps;
            if (countallSteps >= 10000) {
                System.out.printf("Goal reached! Good job!");
                break;
            }
            command = scan.nextLine();
        }
        if (command.equals("Going home")) {
            int stepsToHome = Integer.parseInt(scan.nextLine());
            countallSteps += stepsToHome;
            if (countallSteps >= 10000) {
                System.out.println("Goal reached! Good job!");
            } else {
                goalSteps -= stepsToHome;
                System.out.printf("%d more steps to reach goal.", goalSteps);
            }
        }
    }
}