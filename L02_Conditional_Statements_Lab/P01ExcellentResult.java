package L02_Conditional_Statements_Lab;

import java.util.Scanner;

public class P01ExcellentResult {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());

        if(grade >= 5.5) {
            System.out.println("Excellent!");
        }

    }
}

