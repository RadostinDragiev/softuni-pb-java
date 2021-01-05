package L02_Conditional_Statements_More_Exercises;

import java.util.Scanner;

public class P05Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int neededHoursForTheProject = Integer.parseInt(scanner.nextLine());
        int daysForTheProject = Integer.parseInt(scanner.nextLine());
        int overtimeEmployees = Integer.parseInt(scanner.nextLine());

        double afterTrainingTime = daysForTheProject - (daysForTheProject * 0.10);
        double workingHours = afterTrainingTime * 8;
        double overtimeEmployeesTime = overtimeEmployees * (2 * daysForTheProject);
        double totalTime = Math.floor(workingHours + overtimeEmployeesTime);

        if (totalTime >= neededHoursForTheProject) {
            double leftHours = totalTime - neededHoursForTheProject;
            System.out.printf("Yes!%.0f hours left.", leftHours);
        } else if (totalTime < neededHoursForTheProject) {
            double needMore = neededHoursForTheProject - totalTime;
            System.out.printf("Not enough time!%.0f hours needed.", needMore);
        }
    }
}
