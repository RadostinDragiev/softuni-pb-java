package L03_Nested_Conditional_Statements_Exercise;

import java.util.Scanner;

public class P02Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int colums = Integer.parseInt(scanner.nextLine());

        double income = 0;

        if (type.equals("Premiere")) {
            income = (rows * colums) * 12;
        } else if (type.equals("Normal")) {
            income = (rows * colums) * 7.5;
        } else {
            income = (rows * colums) * 5;
        }

        System.out.printf("%.02f leva", income);
    }
}
