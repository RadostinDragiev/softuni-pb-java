package L04_While_Loop_Lab;

import java.util.Scanner;

public class P07Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int gradeCounter = 1;
        double gradesSum = 0;
        while (gradeCounter <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4.00) {
                gradeCounter++;
                gradesSum += grade;
            }
        }
        System.out.printf("%s graduated. Average grade: %.2f", name, gradesSum / 12);
    }
}
