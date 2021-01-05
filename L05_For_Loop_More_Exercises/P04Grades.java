package L05_For_Loop_More_Exercises;

import java.util.Scanner;

public class P04Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());

        double p1 = 0; // Grades 2.00 - 2.99
        double p2 = 0; // Grades 3.00 - 3.99
        double p3 = 0; // Grades 4.00 - 4.99
        double p4 = 0; // Grades 5 +
        double gradesSum = 0;

        for (int i = 0; i < students; i++) {
            double grades = Double.parseDouble(scanner.nextLine());
            gradesSum += grades;

            if (grades >= 2 && grades < 3) {
                p1++;
            } else if (grades < 4) {
                p2++;
            } else if (grades < 5) {
                p3++;
            } else if (grades >= 5) {
                p4++;
            }
        }

        double fiveOrMorePercent = p4 / students * 100;
        double fourOrMorePercent = p3 / students * 100;
        double threeOrmorePercent = p2 / students * 100;
        double twoOrMorePercent = p1 / students * 100;

        System.out.printf("Top students: %.2f%%%n", fiveOrMorePercent);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", fourOrMorePercent);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", threeOrmorePercent);
        System.out.printf("Fail: %.2f%%%n", twoOrMorePercent);
        System.out.printf("Average: %.2f", gradesSum / students);
    }
}
