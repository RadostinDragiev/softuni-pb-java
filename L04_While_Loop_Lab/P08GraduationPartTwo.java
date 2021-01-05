package L04_While_Loop_Lab;

import java.util.Scanner;

public class P08GraduationPartTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.nextLine();

        int grades = 0;
        double totalGoodGrades = 0;
        int failedGrades = 0;

        while (grades < 12) {
            double eachGrade = Double.parseDouble(scanner.nextLine());
            totalGoodGrades += eachGrade;
            if (eachGrade < 4) {
                failedGrades++;
                if (failedGrades >= 2) {
                    System.out.printf("%s has been excluded at %d grade", studentName, grades);
                    break;
                }
            }
            grades++;
        }

        if (grades == 12) {
            System.out.printf("%s graduated. Average grade: %.2f", studentName, totalGoodGrades / 12);
        }
    }
}
